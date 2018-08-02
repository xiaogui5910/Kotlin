package my.example.com.kotlinweather.bean

import java.util.*

/**
 * 数据类
 * Created by ccg on 2018/7/31.
 */
data class ForecastTest(val date: Date, val temperature:Float, val details:String ){

    fun test(){
        //复制一个数据类
        val f1= ForecastTest(Date(),27.5f,"Shiny day")
        val f2=f1.copy(temperature=30f)

        //映射对象到变量中
//        val (date,temperature,details)=f1

        //上面声明会被编译成下面代码
        val date=f1.component1();
        val temperature=f1.component2()
        val details=f1.component3()
    }
}