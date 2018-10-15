package my.example.com.kotlinweather.tips

/**
 * description ：
 * author : chenchenggui
 * creation date: 2018/10/15
 */
fun testF01() {
    val list = listOf<Int>(1, 2, 3, 4)
    println(list.filter { it > 2 })
}

/**
 * 定义函数类型
 */
fun testF02() {
    val max = { a: Int, b: Int -> a + b }
    val printI = { println(6) }

    val max1: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    val printI1: () -> Unit = { println(6) }
}

/**
 *定义2和3的操作函数
 */
fun twoAndThree(operator: (Int, Int) -> Int) {
    val result = operator(2, 3)
    println("result:$result")

}

fun testF03() {
    //    twoAndThree(){a,b->a+b}
    twoAndThree { a, b -> a + b }
    twoAndThree { a, b -> a * b }
}

/**
 * 函数作为参数，实现String字符串过滤
 */
fun String.filter(operator: (Char) -> Boolean): String {
    val sb = StringBuffer()
    for (index in 0 until length) {
        val indexStr = get(index)
        if (operator(indexStr)) sb.append(indexStr)
    }
    return sb.toString()
}

fun testF04() {
    println("wojiushilaigaoxiaode".filter { it in 'a'..'f' })
}

enum class Dilivery {
    STANDARD, EXPEDITED
}

fun getCost(dilivery: Dilivery): (Int) -> Double {
    if (dilivery == Dilivery.EXPEDITED) {
        return {6.3 + 2.1 * it}
    }
    return {1.5 * it}
}
fun testF05(){
    val cost1= getCost(Dilivery.EXPEDITED)
    val cost2= getCost(Dilivery.STANDARD)
    println("ex cost ${cost1(5)}")
    println("st cost ${cost2(5)}")
}