package my.example.com.kotlinweather.testdemo

/**
 * 变量
 * Created by ccg on 2018/7/31.
 */
class Test001 {
    val FLAG1: Boolean = true
    val FLAG2: Boolean = false

    fun testFun01() {
        val i: Int = 7;
        val d: Double = i.toDouble()

        val c: Char = 'c'
        val i1: Int = c.toInt()

        val bitwiseOr = FLAG1 or FLAG2
        val bitwiseAnd = FLAG1 and FLAG2
    }
    fun testFun02(){
        val i=12 //Int
        val iHex=0x0f //一个十六进制的Int类型
        val l=3L //Long
        val d=3.5 //Double
        val f=3.5F //Float
    }

    fun testFun03(){
        val s="Example"
        val c=s[2] //这只是一个字符'a'

        //迭代/遍历String
        val ss="Example"
        for (cc in ss){
            print(cc)
        }
    }
}