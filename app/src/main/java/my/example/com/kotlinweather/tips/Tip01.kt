package my.example.com.kotlinweather.tips

/**
 * Created by ccg on 2018/9/27.
 */
class Tip01{
    /**
     * kotlin对字符串的加强，三个引号"""中可以包含换行、反斜杠等等特殊字符
     */
    fun test01(){
        val str="abc"
        val str01="""line01\n
        line02
        line03"""
        val strJS="""fun function(){
            document.getElementById("demo").innerHTML="My First JavaScript Function";
        }""".trimMargin()
        println(str)
        println(str01)
        println(strJS)
    }

    /**
     * kotlin字符串模版，可以用$符号拼接变量和表达式
     */
    fun test02(){
        val strings= arrayListOf<String>("abc","def","xyz")
        println("strings=$strings")
        println("strings[0]=${strings[0]}")
        println("strings[1]=${if (strings.size>1)strings[1]else "nullstrings"}")
    }

    /**
     * Kotlin中，美元符号$是特殊字符，在字符串中不能直接显示，必须经过转义，方法1是用反斜杠，方法二是${'$'}
     */
    fun test03(){
        println("input \$")
        println("output ${'$'}")
    }
}

