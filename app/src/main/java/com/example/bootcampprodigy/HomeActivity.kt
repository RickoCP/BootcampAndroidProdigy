package com.example.bootcampprodigy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun intentAboutMe(view: View?) {
        startActivity(Intent(this, AboutMeActivity::class.java))
    }

    fun intentFragmentToFragment(view: View?) {
        startActivity(Intent(this, MainFragmentActivity::class.java))
    }

    fun intentActivityToActivity(view: View?) {
        startActivity(Intent(this, ActivityA::class.java))
    }
}