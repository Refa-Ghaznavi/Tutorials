package com.example.tutorials.KElevenTransferClassesBetweenActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tutorials.R
import kotlinx.android.synthetic.main.activity_second2.*

class KTransferClassesBetweenActivitySerializableSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k_transfer_classes_between_serializable_second)

        // it is just that we want to interpret that serializable result as a person
        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person
        tvPerson.text = person.toString()
    }
}