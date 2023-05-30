package com.example.bootcampprodigy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainFragmentActivity : AppCompatActivity() {
    private val fragmentManager = supportFragmentManager
    private var count = 1; // #added

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // #added
        fragmentManager.addOnBackStackChangedListener {
            for (i in 0 until fragmentManager.backStackEntryCount){
                Log.d("MainActivity", fragmentManager.getBackStackEntryAt(i).name.toString());
            }
            Log.d("MainActivity", "--------------") // #Added for Pop
        }
    }

    // #added
    fun onClickFirst(view: View) {
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.frameLayout, FirstFragment())
        fragmentTransaction.addToBackStack("FirstFragment - ${count++}") // #update
        fragmentTransaction.commit()
    }
    // #added
    fun onClickSecond(view: View) {
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.frameLayout, SecondFragment())
        fragmentTransaction.addToBackStack("SecondFragment - ${count++}") // #update
        fragmentTransaction.commit()
    }

    // #added
    fun onClickPop(view: View) {
        fragmentManager.popBackStack()
    }

    fun intentHome(view: View?) {
        startActivity(Intent(this, HomeActivity::class.java))
    }


}

