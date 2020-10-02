package com.example.tutorials.KElevenPassingDataBetweenActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tutorials.R
import kotlinx.android.synthetic.main.activity_second2.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getIntExtra("EXTRA_AGE",0)
        val country = intent.getStringExtra("EXTRA_COUNTRY")
        val personString = "$name is $age years old and lives in $country"
        tvPerson.text = personString


    }
}