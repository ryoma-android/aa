package com.example.mykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private var mTimer: Timer? = null
    private var mHandrer = Handler()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human()

        human.say()
        human.think()

        val human = Human()
        human.say()
        human.think()
    }
    }
