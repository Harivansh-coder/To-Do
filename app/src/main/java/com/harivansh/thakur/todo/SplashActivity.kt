package com.harivansh.thakur.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent



class SplashActivity : AppCompatActivity() {

//    private val SPLASH_DISPLAY_LENGTH: Long = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);


        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()

        //super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_splash)
//
//        supportActionBar?.hide()
//
//        Handler().postDelayed(Runnable {
//            val mainIntent = Intent(this@SplashActivity, MainActivity::class.java)
//            this@SplashActivity.startActivity(mainIntent)
//            finish()
//        }, SPLASH_DISPLAY_LENGTH)

    }
}