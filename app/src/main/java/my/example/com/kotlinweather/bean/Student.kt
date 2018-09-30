package my.example.com.kotlinweather.bean

/**
 * Created by ccg on 2018/8/7.
 */
open class Student constructor(name: String, age: Int) {
    open fun study() {}
}

class GoodStudent() : Student("", 1) {
    override fun study() {
        //
    }
}

/**
 * 可以省略constructor
 */
//class Stu (name:String){
//
//}

open class A {
    //类中默认方法修饰为final
    open fun f() {
        print("A")
    }

    fun a() {
        print("a")
    }
}

interface B {
    //接口中默认修饰为open
    fun f() {
        print("A")
    }

    fun b() {
        print("b")
    }
}

open class C() : A(), B {
    override fun f() {
        super<A>.f()
        super<B>.f()
    }
}

private fun foo() {}//在student.kt内可见

public var bar: Int = 5//改属性随处可见
    private set//setter只在student.kt内可见
internal val baz = 6//相同模块内可见
