package my.example.com.kotlinweather.tips

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast

/**
 * Created by ccg on 2018/9/29.
 */
fun Activity.toast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

val Context.inputMethodManager: InputMethodManager?
    get() = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

fun Context.hideSoftInput(view: View) {
    inputMethodManager?.hideSoftInputFromWindow(view.windowToken, 0)
}

val Context.screenWidth
    get() = resources.displayMetrics.widthPixels

val Context.screenHeight
    get() = resources.displayMetrics.heightPixels

fun Context.dp2px(value:Int):Int= (value*resources.displayMetrics.density).toInt()


fun AppCompatActivity.addFragment2Activity(fragment: Fragment, containerId:Int){
    val transaction = supportFragmentManager.beginTransaction()
    transaction.add(containerId,fragment)
    transaction.commit()
}

fun Activity.invokeActivity(cls:Class<*>){
    startActivity(Intent(this,cls))
}

