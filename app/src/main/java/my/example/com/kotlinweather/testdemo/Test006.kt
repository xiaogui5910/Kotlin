package my.example.com.kotlinweather.testdemo

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import my.example.com.kotlinweather.application.App

/**
 * Created by ccg on 2018/8/2.
 */
class Test006 {
    fun test() {
        val x: Int = 5
        if (x > 0) {
            Toast.makeText(App.instance, "x is greater than 0", Toast.LENGTH_SHORT).show()
        } else if (x == 0) {

        } else {

        }

        val y= listOf<Int>(1,2,3,4,5)
        val res = if (y != null && y.size > 10) x else null

        when(x){
            1-> print("x==1")
            2-> print("x==2")
            else->{
                print("I am a block")
                print("x is neither 1 or 2")
            }
        }

        val result =when(x){
            0,1->"binary"
            else -> "error"
        }

        val view :TextView= TextView(App.instance)
        when(view){
            is TextView->view.setText("I am a TextView")
            else->view.visibility= View.GONE
        }

        val cost =when(x){
            in 1..10->"cheap"
            in 10..100->"regular"
            in 100..1000->"expensive"
            else->"not rated"
        }

        val s="hello"
        val v:LinearLayout=LinearLayout(App.instance)
//        val res=when{
//            x in 1..10->"cheap"
//            s.contains("hello")->"it is a welcome"
//            v is ViewGroup->"child count:${v.childCount}"
//            else->""
//        }

        //Ranges表达式使用一个..操作符，它实现一个RangeTo方法
        val i:Int=8
        if (i>=0&&i<=10){
            println(i)
        }

        //简化为
        if (i in 0..10){
            println(i)
        }

        //Ranges默认自增长，所以如果像以下代码不会做任何事情
        for (i in 10..0){
            println(i)
        }
        //可以使用downTo函数
        for (i in 10 downTo 0){
            println(i)
        }
        //step定义一个从1到一个值的不同间隙
        for (i in 1..10 step 2){
            println(i)
        }

        //until不包含最后一项，开区间
        for (i in 0 until 10){
            println(i)
        }

        //从ViewGroup中得到一个views列表
        val views=(0..v.childCount-1).map { v.getChildAt(it) }
    }
}