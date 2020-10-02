package com.example.tutorials.HEightCheckBoxRadioButton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.example.tutorials.R
import kotlinx.android.synthetic.main.activity_h_check_box_radio_button.*

class HCheckBoxRadioButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_h_check_box_radio_button)

        btnOrder.setOnClickListener {
            val checkedMeadRadiobuttonId = rgMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeadRadiobuttonId)
            val cheese = cbCheese.isChecked
            val onions = cbOnions.isChecked
            val salad = cbSalad.isChecked
            val orderString = "You ordered a burger with:\n\n" +
                    "${meat.text}" +
                    (if(cheese) "\nCheese" else "") +
                    (if(onions)  "\nOnions" else "")  +
                    (if(salad) "\nSalad" else "")
            tvOrder.text = orderString

        }

    }
}