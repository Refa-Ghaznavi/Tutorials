package com.example.tutorials.EFiveTextViews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tutorials.R
import kotlinx.android.synthetic.main.activity_e_text_views.*

class ETextViews : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e_text_views)

        var count = 0
        btnCount.setOnClickListener {
            count++
            // update the text view
            tvCount.text ="Let's count together: $count"
        }

        // the next functionality code
        var counter = 0
        btnDec.setOnClickListener {
            counter--
            // update the text view
            tvCounter.text = "$counter"
        }
        btnInc.setOnClickListener {
            counter++
            tvCounter.text = "$counter"
        }
        btnReset.setOnClickListener {
            counter = 0
            tvCounter.text = "$counter"
        }

    }
}