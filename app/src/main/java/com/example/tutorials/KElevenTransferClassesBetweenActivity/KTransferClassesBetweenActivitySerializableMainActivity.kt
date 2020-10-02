package com.example.tutorials.KElevenTransferClassesBetweenActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tutorials.KElevenPassingDataBetweenActivity.SecondActivity
import com.example.tutorials.R
import kotlinx.android.synthetic.main.activity_k_passing_data_between_activities.*

class KTransferClassesBetweenActivitySerializableMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k_transfer_classes_between_serializable_main)
        btnApply.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString().toInt()
            val country = etCountry.text.toString()
            val person = Person(name,age,country)
            Intent(this, KTransferClassesBetweenActivitySerializableSecondActivity::class.java).also {
                it.putExtra("EXTRA_PERSON", person)
                startActivity(it)
            }
        }
    }
}