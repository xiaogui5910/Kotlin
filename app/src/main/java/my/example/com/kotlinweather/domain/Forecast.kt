package my.example.com.kotlinweather.domain

/**
 * Created by ccg on 2018/7/31.
 */
data class Forecast(val date:String,val description:String,val high:Int,
                    val low:Int,val iconUrl:String) {
}