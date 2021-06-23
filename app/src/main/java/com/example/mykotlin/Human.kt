package com.example.mykotlin

import android.util.Log

  open class Human(name: String, age: Int, var hobby: String) : Animal(name, age) {




      override fun say() {
         Log.d("kotlin", "私の名前は" + name + "です。" + "年は" + age + "歳です。")

     }

      open fun think() {
        Log.d("kotlin", "私は" + hobby + "について考える")
     }
 }



