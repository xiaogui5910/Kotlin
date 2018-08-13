package my.example.com.kotlinweather.bean

/**
 * 匿名对象可以用作只在本地和使用作用域中生命的类型，如果使用匿名对象作为公有函数的
 * 返回类型或用作公用属性的类型，那么该函数或属性的实际类型灰色匿名对象声明的超类型
 * 如果没有声明任何超类型，就会是Any在匿名对象中添加的成员将无法访问
 * Created by ccg on 2018/8/7.
 */
class TestC{
    private fun foo()=object {
        val x:Int =1
    }

    //公有函数，返回类型为Any
    fun publicFoo()=object {
        val x:Int =2
    }

    fun test(){
        val x1=foo().x   //正确
//        val x2=publicFoo().x  //错误
    }
}