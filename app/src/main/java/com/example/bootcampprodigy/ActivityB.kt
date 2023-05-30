package com.example.bootcampprodigy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
    }

    fun intentC(view: View?) {
        startActivity(Intent(this, ActivityC::class.java))
    }

    fun intentA(view: View?) {
        startActivity(Intent(this, ActivityA::class.java))
    }

    fun intentHome(view: View?) {
        startActivity(Intent(this, HomeActivity::class.java))
    }
}