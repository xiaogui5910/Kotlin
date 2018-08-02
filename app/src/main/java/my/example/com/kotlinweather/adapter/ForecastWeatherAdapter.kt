package my.example.com.kotlinweather.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import my.example.com.kotlinweather.R
import my.example.com.kotlinweather.domain.Forecast
import my.example.com.kotlinweather.domain.ForecastList
import my.example.com.kotlinweather.iterfaces.OnItemClickListener
import my.example.com.kotlinweather.viewholder.MyViewHolder

/**
 * Created by ccg on 2018/8/1.
 */

//普通写法
//class ForecastWeatherAdapter(val weekForecast: ForecastList, val itemClick: OnItemClickListener) :
//        RecyclerView.Adapter<MyViewHolder>() {
//lambda写法
class ForecastWeatherAdapter(val weekForecast: ForecastList, val itemClick: (Forecast)->Unit) :
        RecyclerView.Adapter<MyViewHolder>() {
    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {
//        with(weekForecast.dailyForecast[position]){
//        with(weekForecast[position]) {
//            holder?.textView?.text = "${weekForecast.city}-${weekForecast.country}-$date-$description-$high/$low"
//        }
        holder?.bindForecast(weekForecast[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_forecast, parent, false)
        return MyViewHolder(view, itemClick)
    }

    //    override fun getItemCount(): Int =weekForecast.dailyForecast.size
    override fun getItemCount(): Int = weekForecast.size()

//    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}