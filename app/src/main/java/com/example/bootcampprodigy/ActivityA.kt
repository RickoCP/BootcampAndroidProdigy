package com.example.bootcampprodigy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
    }

    fun intentB(view: View?) {
        startActivity(Intent(this, ActivityB::class.java))
    }

    fun intentC(view: View?) {
        startActivity(Intent(this, ActivityC::class.java))
    }

    fun intentHome(view: View?) {
        startActivity(Intent(this, HomeActivity::class.java))
    }
}