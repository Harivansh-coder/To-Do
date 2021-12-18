package com.example.todo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {



    private val SPLASH_DISPLAY_LENGTH: Long = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);


//        val intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
//        finish()

        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        Handler().postDelayed(Runnable {
            val mainIntent = Intent(this, MainActivity::class.java)
            this.startActivity(mainIntent)
            finish()
        }, SPLASH_DISPLAY_LENGTH)

    }
}