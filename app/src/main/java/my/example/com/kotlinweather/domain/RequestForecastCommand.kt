package my.example.com.kotlinweather.domain

import my.example.com.kotlinweather.bean.ForecastRequest

/**
 * Created by ccg on 2018/8/1.
 */
class RequestForecastCommand(private val zipCode:String):Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest=ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}