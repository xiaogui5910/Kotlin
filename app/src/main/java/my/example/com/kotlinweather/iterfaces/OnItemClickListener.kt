package my.example.com.kotlinweather.iterfaces

import my.example.com.kotlinweather.domain.Forecast

/**
 * Created by ccg on 2018/8/1.
 */
public interface OnItemClickListener {
    operator fun invoke(forecast: Forecast)
}