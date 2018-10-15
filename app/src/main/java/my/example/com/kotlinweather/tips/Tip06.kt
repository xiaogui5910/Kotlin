package my.example.com.kotlinweather.tips

/**
 * description ：
 * author : chenchenggui
 * creation date: 2018/10/11
 */
class SaveUser(val id:Int,val name:String,val address:String,val email:String)

fun saveUser(user:SaveUser){
    if (user.name.isEmpty()){
        throw IllegalArgumentException("can't save user ${user.id} : empty Name")
    }
    if (user.address.isEmpty()){
        throw IllegalArgumentException("can't save user ${user.id} : empty Address")
    }
    if (user.email.isEmpty()){
        throw IllegalArgumentException("can't save user ${user.id} : empty Email")
    }
    //save to db
}

/**
 * 利用局部函数，抽取相同代码
 */
fun saveUser2(user: SaveUser){
    fun validate(value:String, fieldName:String){
        if (value.isEmpty()){
            throw IllegalArgumentException("can't save user ${user.id}:empty $fieldName")
        }
    }

    validate(user.name,"name")
    validate(user.address,"address")
    validate(user.email,"email")
    //save to db
}

fun SaveUser.validateAll(){
    fun validate(value:String,fieldName:String){
        if (value.isEmpty()){
            throw IllegalArgumentException("can't save user $id:empty $fieldName")
        }
    }

    validate(name,"name")
    validate(address,"address")
    validate(email,"email")
}
fun saveUser3(user:SaveUser){
    user.validateAll()
    //save to db
}