package my.example.com.kotlinweather.tips

/**
 * Created by ccg on 2018/9/27.
 */
class Tip03{
    fun printList(){
        val list= listOf<Int>(1,2,3,4)
        println(list)
    }
    fun<T> join2String(collection: Collection<T>,separator:String=",",prefix:String="[",
                       postfix:String="]"):String{
        val buffer=StringBuilder(prefix)
        for ((index,element) in collection.withIndex()){
            if (index>0)buffer.append(separator)
            buffer.append(element)
        }
        buffer.append(postfix)
        return buffer.toString()
    }
    fun printList02(){
        val list= listOf<Int>(1,3,5,7,9)
        println(join2String(list,"-","[","]"))
    }
}