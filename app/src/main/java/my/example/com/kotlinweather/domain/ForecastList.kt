package my.example.com.kotlinweather.domain

/**
 * Created by ccg on 2018/7/31.
 */
data class ForecastList(val id:Long,val city: String, val country: String, val dailyForecast: List<Forecast>) {
//    operator fun get(position: Int):Forecast=dailyForecast[position]
//    fun size():Int=dailyForecast.size

    /**
     * 在Kotlin中，我们不需要去指定一个函数的返回值类型，它可以让编译器推断出来。
     *
     * 我们可以省略返回值类型的典型情景是当我们要给一个函数或者一个属性赋值的时
     * 候。而不需要去写代码块去实现。
     */
    operator fun get(position: Int) = dailyForecast[position]

    fun size() = dailyForecast.size
}