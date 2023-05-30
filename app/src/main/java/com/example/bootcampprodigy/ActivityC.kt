package com.example.bootcampprodigy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
    }

    fun intentA(view: View?) {
        startActivity(Intent(this, ActivityA::class.java))
    }

    fun intentB(view: View?) {
        startActivity(Intent(this, ActivityB::class.java))
    }

    fun intentHome(view: View?) {
        startActivity(Intent(this, HomeActivity::class.java))
    }
}