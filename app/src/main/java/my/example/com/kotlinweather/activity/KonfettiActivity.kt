package my.example.com.kotlinweather.activity

import android.os.Bundle
import android.os.Handler
import android.support.design.widget.BottomSheetBehavior
import android.support.v7.app.AppCompatActivity
import android.view.View
import my.example.com.kotlinweather.R

class KonfettiActivity : AppCompatActivity() {
    lateinit var bottomSheetBehavior:BottomSheetBehavior<View>
    private val updateHandler=Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konfetti)
    }
}
