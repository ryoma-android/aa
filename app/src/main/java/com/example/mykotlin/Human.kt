package com.example.mykotlin

open class Human: Animal {

    constructor(name: String, age: Int, hobby: String) : super(name, age, hobby) {
　　　init {

            override fun say() {
                Log.d("私の名前は" + Human.name + "です。" "年は" + Human.age + "歳です。")
            }

            interface thinkable {
                override fun think() {
                    Log.d("私は" + this.hobby + "について考える。")
                }
            }
        }

        }
    }
}
