package my.example.com.kotlinweather.db

/**
 * Created by ccg on 2018/8/2.
 */
class DayForecast (val map:MutableMap<String,Any?>){
    var _id:Long by map
    var date:String by map
    var description:String by map
    var high:Int by map
    var low:Int by map
    var iconUrl:String by map
    var cityId:Long by map

    constructor(date:String,description:String,high:Int,low:Int
                ,iconUrl:String,cityId:Long)
    :this(HashMap()){
        this.date=date
        this.description=description
        this.high=high
        this.low=low
        this.iconUrl=iconUrl
        this.cityId=cityId
    }
}