package my.example.com.kotlinweather.tips

/**
 * Created by ccg on 2018/9/30.
 */
open class A

class B : A()

fun A.foo() = "a"

fun B.foo() = "b"

fun printFoo(a: A) {
    println(a.foo())
}

fun testStaticEx(){
    printFoo(A())
    printFoo(B())
}
