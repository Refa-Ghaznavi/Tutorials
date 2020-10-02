package com.example.tutorials.DFouthConstraintLayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.tutorials.R
import kotlinx.android.synthetic.main.activity_d_constraint_layout.*
import kotlin.math.log

class DConstraintLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d_constraint_layout)

        //val btnApply = findViewById<Button>(R.id.btnApply)
        btnApply.setOnClickListener {
            val firstName = etFirstName.text.toString()
            val lastName = etLastName.text.toString()
            val birthDate = etBirthDate.text.toString()
            val country = etCountry.text.toString()
            Log.d("DConstraintLayout","$firstName $lastName, born on $birthDate, from $country just applied to the formula.")
        }
    }
}