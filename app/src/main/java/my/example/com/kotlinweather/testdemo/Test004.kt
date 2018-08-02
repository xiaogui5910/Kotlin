package my.example.com.kotlinweather.testdemo

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * 委托属性
 * Created by ccg on 2018/8/2.
 */
class Test004<T> : ReadWriteProperty<Any?, T> {
    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * Observable
     * 这个委托会帮我们监测我们希望观察的属性的变化。当被观察属性的 set 方法被调用的时候
        ，它就会自动执行我们指定的lambda表达式。所以一旦该属性被赋了新的值，我们就会接收到
        被委托的属性、旧值和新值。
     */
//    class ViewModel(val db:MyDatabase){
//        var myProperty by Delegates.observable(""){
//            d,old,new->
//            db.saveChanges(this,new)
//        }
//    }

    class Configuration(map:Map<String,Any?>){
        val width:Int by map
        val height:Int by map
        val dp:Int by map
        val deviceName:String by map
    }
}