package com.example.tutorials.JTenIntentsStartingActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tutorials.R
import kotlinx.android.synthetic.main.activity_j_intents_starting.*

class JIntentsStartingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_j_intents_starting)
        btnOpenActivity.setOnClickListener {
            // you can think of it as a intention to do something
            // we want to say to android to perform an action
            Intent(this, SecondActivity::class.java).also {
                startActivity(it)

            }

        }
    }
}