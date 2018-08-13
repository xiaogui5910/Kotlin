package my.example.com.kotlinweather.testdemo

/**
 * Created by ccg on 2018/8/7.
 */
class Test007 {
    fun check(x:Int,
             isInt:Boolean,
             isDouble:Boolean){
        print(x)
    }

    fun test(){
        check(1,true,false)
        //方便理解
        check(1,isInt = true,isDouble = false)
    }
}