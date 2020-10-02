package com.example.tutorials.GSevenImageViews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tutorials.R
import kotlinx.android.synthetic.main.activity_f_six_edit_texts.*
import kotlinx.android.synthetic.main.activity_g_seven_image_views.*
import kotlinx.android.synthetic.main.activity_g_seven_image_views.view.*

class GSevenImageViews : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_g_seven_image_views)

        btnAddImage.setOnClickListener {
            ivImage.setImageResource(R.drawable.pizza)
        }
        btnRemoveImage.setOnClickListener {
            ivImage.setImageResource(R.drawable.pizza)
        }

    }
}