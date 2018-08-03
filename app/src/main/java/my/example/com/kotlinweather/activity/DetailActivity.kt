package my.example.com.kotlinweather.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import my.example.com.kotlinweather.R

class DetailActivity : AppCompatActivity() {

    companion object {
        val ID = "DetailActivity:id"
        val CITY_NAME = "DetailActivity:cityName"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        title=intent.getStringExtra(CITY_NAME)

//        doAsync {
//            val result=RequestForecastCommand(
//                    intent.getLongExtra(ID,-1)).execute()
//        }
    }

}
