package com.example.mykotlin

import android.util.Log

  open class Human(name: String, age: Int, hobby: String) : Animal(name, age, hobby) {


      override fun say() {
         Log.d("kotlin", "私の名前は" + name + "です。" )
         Log.d("kotlin", "年は" + age + "歳です。")
     }

    open fun think() {
        Log.d("kotlin", "私は" + hobby + "について考える")
     }
 }


