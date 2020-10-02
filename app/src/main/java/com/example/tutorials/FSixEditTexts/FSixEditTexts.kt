package com.example.tutorials.FSixEditTexts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tutorials.R
import kotlinx.android.synthetic.main.activity_e_text_views.*
import kotlinx.android.synthetic.main.activity_f_six_edit_texts.*
import kotlinx.android.synthetic.main.activity_f_six_edit_texts.btnReset

class FSixEditTexts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f_six_edit_texts)

        btnAdd.setOnClickListener {
            val firstName = etFirstNumber.text.toString().toInt()
            val secondName = etSecondNumber.text.toString().toInt()
            val result = firstName + secondName
            // we can set strings to an editable
            // but we can not get string from an editable without calling to string
            tvResult.text = result.toString()
        }
        btnSub.setOnClickListener {
            val firstName = etFirstNumber.text.toString().toInt()
            val secondName = etSecondNumber.text.toString().toInt()
            val result = firstName - secondName
            // we can set strings to an editable
            // but we can not get string from an editable without calling to string
            tvResult.text = result.toString()
        }
        btnMulti.setOnClickListener {
            val firstName = etFirstNumber.text.toString().toInt()
            val secondName = etSecondNumber.text.toString().toInt()
            val result = firstName * secondName
            // we can set strings to an editable
            // but we can not get string from an editable without calling to string
            tvResult.text = result.toString()
        }
        btnDiv.setOnClickListener {
            val firstName = etFirstNumber.text.toString().toDouble()
            val secondName = etSecondNumber.text.toString().toDouble()
            val result = firstName / secondName
            // we can set strings to an editable
            // but we can not get string from an editable without calling to string
            tvResult.text = result.toString()
        }
        btnReset.setOnClickListener {
            val result = 0
            tvResult.text = "$result"
        }
    }
}