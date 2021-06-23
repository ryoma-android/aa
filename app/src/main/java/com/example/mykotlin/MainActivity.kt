package com.example.mykotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("高橋", 22,"バスケ")


        human.say()
        Log.d("kotlin", "私の名前は" + human.name + "です。"  + "年は" + human.age + "歳です。")


        human.think()
        Log.d("kotlin", "私は" + human.hobby + "について考える。")


        val human2 = Human("高橋", 22,"バスケ")


        human2.say()
        Log.d("kotlin", "私の名前は" + human.name + "です。" + "年は"  + human.age + "歳です。")



        human2.think()
        Log.d("kotlin", "私は" + human.hobby + "について考える。")

    }


}












