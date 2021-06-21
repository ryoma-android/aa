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
        Log.d("私の名前は" + Human.name + "です。" "年は" + Human.age + "歳です。")
        human.think()
        Log.d("私は" + this.hobby + "について考える。")

        val human = Human()

        human.say()
        Log.d("私の名前は" + Human.name + "です。" "年は" + Human.age + "歳です。")
        human.think()
        Log.d("私は" + this.hobby + "について考える。")
    }
    }
