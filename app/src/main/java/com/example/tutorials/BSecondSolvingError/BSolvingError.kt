package com.example.tutorials.BSecondSolvingError

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.tutorials.R
import java.util.*

class BSolvingError : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_solving_error_b_solving_error)

        val list = listOf(5, 3, 6, 7, 9, 1)
        sortList(list)
        Log.d("BSolvingError","Hello, This is the first log message")
        println(list)
    }

    private fun sortList(list: List<Int>) {
        for (i in 0..list.size - 1){
            // for (j in 0..list.size - 1){ error that goes to 6 index to solve that
            for (j in 0..list.size - 2){
                if (list[j] > list[j + 1]){
                    Collections.swap(list,j,j + 1)
                }
            }
        }

    }
}