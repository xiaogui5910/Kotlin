package my.example.com.kotlinweather.testdemo

import android.widget.TextView

/**
 * 属性
 * Created by ccg on 2018/7/31.
 */
class Test002 {
    var name: String = ""

    fun test() {
        val test02 = Test002()
        test02.name = "zhang san"
        val name = test02.name
    }
    public var TextView.text:CharSequence
    get()=getText()
    set(value) = setText(value)
}