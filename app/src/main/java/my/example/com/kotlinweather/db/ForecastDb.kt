package my.example.com.kotlinweather.db

import android.database.sqlite.SQLiteDatabase
import my.example.com.kotlinweather.domain.ForecastList
import org.jetbrains.anko.db.MapRowParser
import org.jetbrains.anko.db.SelectQueryBuilder
import org.jetbrains.anko.db.select

/**
 * Created by ccg on 2018/8/3.
 */
class ForecastDb(val forecastDbHelper: ForecastDbHelper = ForecastDbHelper.instance
                 , val dataMapper: DbDataMapper = DbDataMapper()) {

    fun requestForecastByZipCode(zipCode: Long, date: Long) = forecastDbHelper.use {
        val dailyRequest = "${DayForecastTable.CITY_ID}={id}" + "AND ${DayForecastTable.DATE}>={date}"
        val dailyForecast = select(DayForecastTable.NAME)
                .whereSimple(dailyRequest, zipCode.toString(), date.toString())
                .parseList { DayForecast(HashMap(it)) }
        val city = select(CityForecastTable.NAME)
                .whereSimple("${CityForecastTable.ID}=?", zipCode.toString())
                .parseOpt { CityForecast(HashMap(it), dailyForecast) }
        if (city != null) dataMapper.convertToDomain(city) else null
    }

    fun <T : Any> SelectQueryBuilder.parseList(parser: (Map<String, Any?>) -> T): List<T> = parseList(object : MapRowParser<T> {
        override fun parseRow(columns: Map<String, Any?>): T = parser(columns)
    })

    fun <T : Any> SelectQueryBuilder.parseOpt(parser: (Map<String, Any?>) -> T): T? = parseOpt(object : MapRowParser<T> {
        override fun parseRow(columns: Map<String, Any?>): T = parser(columns)

    })

    fun saveForecast(forecast: ForecastList) = forecastDbHelper.use {
        clear(CityForecastTable.NAME)
        clear(DayForecastTable.NAME)
//        with(dataMapper.convertFromDomain(forecast)) {
//            insert(CityForecastTable.NAME, *map.toVarargArray())
//            dailyForecast.forEach {
//                insert(DayForecastTable.NAME, *it.map.toVarargArray())
//            }
//        }
    }

    fun SQLiteDatabase.clear(tableName: String) {
        execSQL("delete from $tableName")
    }

//    fun <K, V : Any> MutableMap<K, V?>.toVarargArray():
//            Array<out Pair<K, V>>=map(
//    { Pair(it.key, it.value!!) }).toTypeArray()


}


