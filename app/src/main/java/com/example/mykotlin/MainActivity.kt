package com.example.mykotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("高橋", 22,"バスケ")


        human.say()

        human.think()



        val human2 = Human("田中", 23,"サッカー")


        human2.say()

        human2.think()


    }


}












