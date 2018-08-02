package my.example.com.kotlinweather.Utils

import android.util.Log
import java.net.URL

/**
 * Created by ccg on 2018/7/31.
 */
public class Request(val url: String) {
    public fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}