package com.example.tutorials.KElevenPassingDataBetweenActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tutorials.R
import kotlinx.android.synthetic.main.activity_k_passing_data_between_activities.*

class KPassingDataBetweenActivities : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k_passing_data_between_activities)

        btnApply.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString().toInt()
            val country = etCountry.text.toString()

            Intent(this,SecondActivity::class.java).also {
                it.putExtra("EXTRA_NAME",name)
                it.putExtra("EXTRA_AGE",age)
                it.putExtra("EXTRA_COUNTRY",country)

            startActivity(it)
            }
        }
    }
}