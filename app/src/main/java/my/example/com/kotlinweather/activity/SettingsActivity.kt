package my.example.com.kotlinweather.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import my.example.com.kotlinweather.R

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
    }

    override fun onOptionsItemSelected(item: MenuItem?)=when(item?.itemId){
        android.R.id.home->{onBackPressed();true}
        else->false
    }
}
