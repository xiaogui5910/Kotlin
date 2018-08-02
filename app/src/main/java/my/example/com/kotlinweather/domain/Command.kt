package my.example.com.kotlinweather.domain

/**
 * Created by ccg on 2018/7/31.
 */
public interface Command<T> {
    fun execute():T
}