package my.example.com.kotlinweather.bean

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Created by ccg on 2018/8/2.
 */
private class NotNullSingleValueVar<T>() : ReadWriteProperty<Any?, T> {
    private var value: T? = null

    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return value ?: throw IllegalStateException(value.toString() + "not initialized")
//        throw UnsupportedOperationException()
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        this.value = if (this.value == null) value
        else throw IllegalStateException(value.toString() + "already initialized")
    }
}