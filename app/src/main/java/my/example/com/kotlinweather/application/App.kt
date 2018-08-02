package my.example.com.kotlinweather.application

import android.app.Application
import kotlin.properties.Delegates

/**
 * Created by ccg on 2018/8/2.
 */
class App : Application() {
    companion object {
        //        private var instance :Application?=null
        var instance:App by Delegates.notNull()
        fun instance() = instance!!


    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        //database并没有被真正初始化，知道第一次调用onCreate时
        //lazy操作符是线程安全的，如果不担心多线程问题或者提高更多的性能可以使用
//        lazy (LazyThreadSafetyMode.NONE){  }
//        val db database.writableDatabase
    }

//    val database:SQLiteOpenHelper by lazy {
//        MyDatabaseHelper(applicationContext)
//    }
}