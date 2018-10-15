package my.example.com.kotlinweather.tips

import android.content.Context
import android.graphics.Color
import android.widget.ImageView
import android.widget.TextView

/**
 * description ：
 * author : chenchenggui
 * creation date: 2018/10/11
 */
fun alphabet(): String {
    val result = StringBuffer()
    result.append("start\n")
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    return result.append("\nend").toString()
}

/**
 * 通过with语句，将result作为参数传入，在内部可要通过this表示result变量，this也可以省略
 */
fun alphabet2(): String {
    val result = StringBuffer("start\n")
    return with(result) {
        for (letter in 'a'..'z') {
            append(letter)
        }
        append("\nend")
        toString()
    }
}

fun alphabet3(): String {
    return with(StringBuffer("start\n")) {
        for (letter in 'a'..'z') {
            append(letter)
        }
        append("\nend")
        toString()
    }
}

/**
 * apply简化代码，在apply括号里面可要使用类的公有方法和属性
 */
fun alphabet4() = StringBuffer("start\n").apply {
    for (letter in 'a'..'z') {
        append(letter)
    }
    append("\nend")
}.toString()


fun showTest(context:Context){
    var img=ImageView(context).apply {
        setBackgroundColor(Color.BLACK)
        setImageBitmap(null)
    }

    var text=TextView(context).apply {
        text="test text"
        textSize=16.0f
        setPadding(10,10,10,10)
    }

}