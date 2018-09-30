package my.example.com.kotlinweather.tips


/**
 * Created by ccg on 2018/9/30.
 */
open class D

class D1 : D()

open class C{
    open fun D.foo(){
        println("D.foo in C")
    }
    open fun D1.foo(){
        println("D1.foo in C")
    }

    fun caller(d:D){
        d.foo()
    }
    fun caller1(d:D1){
        d.foo()
    }
}

class C1 : C(){
    override fun D.foo() {
        println("D.foo in C1")
    }
    override fun D1.foo() {
        println("D1.foo in C1")
    }
}

fun testExAsMem(){
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    C().caller(D())
    C().caller(D1())
    C().caller1(D1())

    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

    C1().caller(D())
    C1().caller(D1())
    C1().caller1(D1())
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
}