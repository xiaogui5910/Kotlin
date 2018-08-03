package my.example.com.kotlinweather.domain

import my.example.com.kotlinweather.bean.Forecast
import my.example.com.kotlinweather.bean.ForecastResult
import java.text.DateFormat
import java.util.*
import my.example.com.kotlinweather.domain.Forecast as ModelForecast

/**
 * Created by ccg on 2018/7/31.
 */
public class ForecastDataMapper {
    fun convertFromDataModel(forecast: ForecastResult): ForecastList {
        return ForecastList(0,forecast.city.name, forecast.city.country,
                convertForecastListToDomain(forecast.list))
    }

    private fun convertForecastListToDomain(list: List<Forecast>)
            : List<ModelForecast> {
        return list.map { convertForecastItemToDomain(it) }
    }

    private fun convertForecastItemToDomain(forecast: Forecast): ModelForecast {
        return ModelForecast(convertDate(forecast.dt), forecast.weather[0].description,
                forecast.temp.max.toInt(), forecast.temp.min.toInt(),
                generateIconUrl(forecast.weather[0].icon))
    }

    private fun generateIconUrl(iconCode: String): String
            = "http://openweathermap.org/img/w/$iconCode.png"

    private fun convertDate(date: Long): String {
        val df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        return df.format(date * 1000)
    }
}