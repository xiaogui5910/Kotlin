package my.example.com.kotlinweather.tips

/**
 * description ：
 * author : chenchenggui
 * creation date: 2018/10/15
 */
class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
    operator fun minus(other: Point):Point{
        return Point(x-other.x,y-other.y)
    }

    override fun toString(): String {
        return "[x=$x,y=$y]"
    }
}

fun testOperator(){
    val point1=Point(6,6)
    val point2=Point(5,5)
    val point3=point1+point2
    val point4=point1-point2
    println(point3)
    println(point4)
}