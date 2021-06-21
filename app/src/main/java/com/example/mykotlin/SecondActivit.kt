package com.example.mykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val brnBack: Buttton = findViewById<>(R.id.btnBack)

        btnback.setOnClickListener {
            finish()

        }
    }
}