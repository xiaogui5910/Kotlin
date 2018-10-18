package my.example.com.kotlinweather.tips

import my.example.com.kotlinweather.bean.Animal

/**
 * description ：
 * author : chenchenggui
 * creation date: 2018/10/15
 */

fun testFun01() {
    val user = User1("xiaozhang", 18, 3, "test")

    val user1: User1? = User1("xiaosi", 19, 2, "test2")

    println(user.name)
    println(user1?.name)
    println(user1!!.name)
    //不推荐
    println(user1!!.name!!.equals("xiaozhang"))
    //可以使用let,通过let语句，在?.let之后，如果为空不会有任何操作，只有在非空的时候才会执行let之后的操作
    println(user1?.let {
        it.name
        it.age
        it.toString()
    })

    var str: String? = "111"
    //lvis操作符 ?: 简化对空值的处理
    val b=str?.length?:-1
    val name=user1?.name?:User1("nullname",1,1,"1").name

}