package my.example.com.kotlinweather.bean

/**
 * Created by ccg on 2018/7/31.
 */
data class Forecast(val dt:Long,val temp:Temperature,val pressure:Float,val humidity:Int,
                    val weather:List<Weather>,val speed:Float,val deg:Int,val clouds:Int,
                    val rain:Float) {
}