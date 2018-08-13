package my.example.com.kotlinweather.testdemo

/**
 * 函数组合
 * -函数引用
 * Created by ccg on 2018/8/8.
 */
class Test008 {
    fun isOdd(x: Int) = x % 2 != 0
    fun length(s: String) = s.length
    fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
        return { x -> f(g(x)) }
    }

    /**
     * 这里::isOdd是函数类型(Int)->Boolean的一个值
     */
    fun test() {
        val oddLength = compose(::isOdd, ::length)
        val strings = listOf("a", "ab", "abc")
        println(strings.filter(oddLength))
    }

    var x = 1
    /**
     * 属性引用
     */
    fun test01() {
        println(::x.get())
        ::x.set(2)
        println(x)
    }

    /**
     * 属性引用可以用在不需要参数的函数处
     */
    fun test03() {
        val strs = listOf("a", "ab", "abc", "adcd")
        println(strs.map { String::length })
    }

    class TestA(val p: Int)

    /**
     * 访问类成员属性
     */
    fun test04() {
        val prop = TestA::p
        println(prop.get(TestA(1)))
    }

//    val String.lastChar: Char
//        get() = this[length - 1]
//
//    fun test005() {
//        println(String::lastChar.get("abc"))
//    }

    /**
     * 绑定函数与属性引用
     */
    fun test05(){
        val numberRegex="\\d+".toRegex()
        println(numberRegex.matches("29"))//输出true

        val isNumber=numberRegex::matches
        println(isNumber("29")) //输出true

        val strs= listOf("12","26","99","abc")
        println(strs.filter(isNumber))

        //属性引用
        val prop="abc"::length
        println(prop.get())//输出3
    }
}