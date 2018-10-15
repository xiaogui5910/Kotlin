package my.example.com.kotlinweather.tips

/**
 * description ：
 * project name：Kotlin
 * author : chenchenggui
 * creation date: 2018/10/11 下午3:42
 * @version 1.0
 */

class MyUser(var name:String,var age:Int)

val myUser:MyUser by lazy {
    MyUser("zhangsan",23)
}

lateinit var myUser2: MyUser
fun testLazy(){
    myUser2 = MyUser("lisi",24)

    println(myUser)
    println(myUser2)
}