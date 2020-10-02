package com.example.tutorials.INineToastsContext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View.inflate
import android.widget.Toast

import com.example.tutorials.R
import kotlinx.android.synthetic.main.activity_i_toasts_context.*
import kotlinx.android.synthetic.main.custom_toast.*

class IToastsContext : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_i_toasts_context)

        btnShow.setOnClickListener {
            //Toast.makeText(this,"Hi, I'm a Toast!", Toast.LENGTH_LONG)
            // in kotlin scope function apply we can directly refer to toast
            Toast(applicationContext).apply {
                duration = Toast.LENGTH_LONG
                view = layoutInflater.inflate(R.layout.custom_toast,clToast)
                show()
            }
        }
    }
}