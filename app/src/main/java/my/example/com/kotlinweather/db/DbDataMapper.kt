package my.example.com.kotlinweather.db

import my.example.com.kotlinweather.domain.Forecast
import my.example.com.kotlinweather.domain.ForecastList

/**
 * Created by ccg on 2018/8/3.
 */
class DbDataMapper {
    fun convertToDomain(forecast: CityForecast)= with(forecast){
        val daily=dailyForecast.map { convertDayToDomain(it) }
        ForecastList(_id,city,country,daily)
    }

    private fun convertDayToDomain(dayForecast: DayForecast)= with(dayForecast){
        Forecast(date,description,high,low,iconUrl)
    }

    fun convertFromDomain(forecast: ForecastList) = with(forecast) {
        val daily = dailyForecast.map { convertDayFromDomain(id, it) }
        CityForecast(id, city, country, daily)
    }

    private fun convertDayFromDomain(cityId: Long, forecast: Forecast) = with(forecast) {
        DayForecast(date, description, high, low, iconUrl, cityId)
    }

}