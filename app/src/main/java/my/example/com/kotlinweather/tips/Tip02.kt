package my.example.com.kotlinweather.tips

/**
 * Created by ccg on 2018/9/27.
 */
class Tip02{
    fun test01(a:Int, b:Int):Int{
     return if (a>b)a else b
    }
    fun test02(a:Int,b: Int)=if (a>b)a else b

    fun test03(grade:Char)=when(grade){
        'A'->"good"
        'B','C'->{
            println("test03 when $grade")
            "ok"
        }
        'D'->"bad"
        else->"un know"
    }

    fun test04(grade:Int)=when{
        grade>90->"good"
        grade>60->"ok"
        grade.hashCode()==0x100->"STH"
        else->"un know"
    }
}