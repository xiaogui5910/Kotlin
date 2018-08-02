package my.example.com.kotlinweather.testdemo

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * 委托属性
 * Created by ccg on 2018/8/2.
 */
class Test004<T> :ReadWriteProperty<Any?,T> {
    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}