package com.example.tutorials.AFirstCode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tutorials.R

class ALifeCycle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_first_code_a_life_cycle)
    }

    // first shortcut Control + O
    override fun onPause() {
        super.onPause()
        println("onPause")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart")
    }
}