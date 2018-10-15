package my.example.com.kotlinweather.tips

/**
 * description ：创建类
 * author : chenchenggui
 * creation date: 2018/10/11
 */
/**
 * Kotlin会给类自动生成set，get方法
 */
class User1(val name:String,val age:Int,val gender:Int,val address:String)

/**
 * data关键词修饰一个类，除了自动生成set，get方法还会自动生成equals,hashcode,toString
 */
data class User2(val name:String,val age:Int,val gender:Int,val address:String)