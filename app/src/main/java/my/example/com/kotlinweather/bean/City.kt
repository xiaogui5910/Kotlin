package my.example.com.kotlinweather.bean

/**
 * Created by ccg on 2018/7/31.
 */
data class City(val id: Long, val name: String, val coord: Coordinates,
                val country: String, val population: Int) {
}