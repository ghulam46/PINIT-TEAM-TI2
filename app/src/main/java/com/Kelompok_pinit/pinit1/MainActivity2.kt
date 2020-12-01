package com.Kelompok_pinit.pinit1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button2.setOnClickListener{

            val moveWithDataIntent = Intent(this@MainActivity2, login::class.java)
            startActivity(moveWithDataIntent)
        }
        button3.setOnClickListener{

            val moveWithDataIntent = Intent(this@MainActivity2, registrasi::class.java)
            startActivity(moveWithDataIntent)
        }


    }
}