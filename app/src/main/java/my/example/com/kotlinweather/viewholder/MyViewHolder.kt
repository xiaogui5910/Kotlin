package my.example.com.kotlinweather.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_forecast.view.*
import my.example.com.kotlinweather.domain.Forecast

/**
 * Created by ccg on 2018/8/1.
 */
//普通写法
//class MyViewHolder(view: View, val itemClick: OnItemClickListener)
//    : RecyclerView.ViewHolder(view) {
//lambda写法
class MyViewHolder(view: View, val itemClick: (Forecast)->Unit)
    : RecyclerView.ViewHolder(view) {
//    private val iconView: ImageView
//    private val dateView: TextView
//    private val descriptionView: TextView
//    private val maxTemperatureView: TextView
//    private val minTemperatureView: TextView
//    init {
//        iconView=view.find(R.id.icon)
//        dateView=view.find(R.id.date)
//        descriptionView=view.find(R.id.description)
//        maxTemperatureView=view.find(R.id.maxTemperature)
//        minTemperatureView=view.find(R.id.minTemperature)
//    }
//    fun bindForecast(forecast: Forecast){
//        with(forecast){
//            Glide.with(itemView.context).load(iconUrl).into(iconView)
//            dateView.text=date
//            descriptionView.text=description
//            maxTemperatureView.text="$high"
//            minTemperatureView.text="$low"
//            itemView.setOnClickListener {itemClick(forecast)  }
//        }
//    }

    //优化写法，导入item_forecast
        fun bindForecast(forecast: Forecast){
        with(forecast){
            Glide.with(itemView.context).load(iconUrl).into(itemView.icon)
            itemView.date.text=date
            itemView.description.text=description
            itemView.maxTemperature.text="$high"
            itemView.minTemperature.text="$low"
            itemView.setOnClickListener {itemClick(forecast)  }
        }
    }
}