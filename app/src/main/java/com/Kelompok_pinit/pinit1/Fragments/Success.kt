package com.Kelompok_pinit.pinit1.Fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.Kelompok_pinit.pinit1.R
import com.Kelompok_pinit.pinit1.home
import com.Kelompok_pinit.pinit1.login
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_success.*

class Success : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)
        button4.setOnClickListener{

            val moveWithDataIntent = Intent(this@Success, home::class.java)
            startActivity(moveWithDataIntent)
        }
    }
}