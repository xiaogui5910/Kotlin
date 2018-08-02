package my.example.com.kotlinweather.application

import android.app.Application

/**
 * Created by ccg on 2018/8/2.
 */
class App :Application() {
    companion object {
        private var instance :Application?=null
        fun instance()=instance!!
    }

    override fun onCreate() {
        super.onCreate()
        instance=this
    }
}