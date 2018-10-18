package my.example.com.kotlinweather.testdemo

import java.util.*

/**
 * Created by ccg on 2018/8/1.
 */
class Test003 {
    fun test01(){
        val letterMap=TreeMap<Char,String>()
        for (c in 'A'..'F'){
            val letterStr=Integer.toBinaryString(c.toInt())
            letterMap[c]=letterStr
        }

        for ((letter,binary) in letterMap){
            println("$letter--$binary")
        }
    }
}