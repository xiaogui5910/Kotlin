package my.example.com.kotlinweather.Utils

import android.content.Context
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Created by ccg on 2018/8/3.
 */
class LongPreference(val context: Context, val name: String, val default: Long)
    : ReadWriteProperty<Any?, Long> {
    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Long) {
        prefs.edit().putLong(name, value).apply()
    }

    val prefs by lazy { context.getSharedPreferences("default", Context.MODE_PRIVATE) }
    override fun getValue(thisRef: Any?, property: KProperty<*>): Long {
        return prefs.getLong(name, default)
    }
}