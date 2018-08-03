package my.example.com.kotlinweather.activity

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import my.example.com.kotlinweather.R
import my.example.com.kotlinweather.adapter.ForecastWeatherAdapter
import my.example.com.kotlinweather.domain.RequestForecastCommand
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.find
import org.jetbrains.anko.uiThread

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_msg.text = "Hello Kotlin!"

//        toast("Hello Kotlin!")
//        toast("Hello Kotlin!",Toast.LENGTH_SHORT)

        //Anko
        val rvForecastList = find<RecyclerView>(R.id.rv_forecast_list)
        //普通获取view方法
//        var rvForecastList = findViewById<RecyclerView>(R.id.rv_forecast_list) as RecyclerView
        //通过Kotlin_Android_Extensions获取
//        var rvForecastList=rv_forecast_list
//        rvForecastList.layoutManager = LinearLayoutManager(this)
//        rvForecastList.adapter= ForecastListAdapter(items)

        rv_forecast_list.layoutManager = LinearLayoutManager(this)
//        rv_forecast_list.adapter= ForecastListAdapter(items)

        //Anko 自己的toast扩展函数
        toast("hello kotlin")

        //方法过时
//        val url:String=""
//        //执行一个请求
//        async{
//            Request(url).run()
//            uiThread{
//                longToast("Requst performed")
//            }
//        }
        //用doasync替换
        doAsync {
            val result = RequestForecastCommand("94043").execute()
            uiThread {
                //普通写法
//                rvForecastList.adapter= ForecastWeatherAdapter(result,object : OnItemClickListener {
//                    override fun invoke(forecast: Forecast) {
//                        toast(forecast.date)
//                    }
//                })
                //lambda写法
//                rvForecastList.adapter=ForecastWeatherAdapter(result){forecast -> forecast.date }
                rv_forecast_list.adapter = ForecastWeatherAdapter(result) {
                    toast(it.date)
//                    startActivity<DetailActivity>(DetailActivity.ID to it.id,
//                            DetailActivity.CITY_NAME to result.city)
                }
            }
        }

//        val intent= Intent(MainActivity@this,javaClass<DetailActivity>())
    }

    private val items = listOf<String>(
            "test text 1",
            "test text 2",
            "test text 3",
            "test text 4",
            "test text 5",
            "test text 6",
            "test text 7"
    )
//----------------------------------------------------------------------
//    fun toast(message: String, length: Int = Toast.LENGTH_SHORT) {
//        Toast.makeText(this, message, length).show()
//    }

//    fun niceToast(message: String, tag: String = javaClass<MainActivity>().getSimpleName(),
//                  length: Int = Toast.LENGTH_SHORT) {
//
//    }
// ----------------------------------------------------------------------

    fun Context.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show()
    }

    /**
     * 它只是检查版本，然后如果满足条件则去执行。现在我们可以这么做：
     * supportsLollipop {
        window.setStatusBarColor(Color.BLACK)
        }
     */
    inline fun supportsLollipop(code: () -> Unit) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            code()
        }
    }
}
