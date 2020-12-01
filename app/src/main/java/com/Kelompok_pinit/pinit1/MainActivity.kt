package com.Kelompok_pinit.pinit1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{

            val moveWithDataIntent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(moveWithDataIntent)
        }
    }
}