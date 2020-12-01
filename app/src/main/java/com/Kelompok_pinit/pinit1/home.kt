package com.Kelompok_pinit.pinit1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<FloatingActionButton>(R.id.floatingActionButton2).setOnClickListener { view ->
            val moveWithObjectIntent = Intent(this, home::class.java)
            startActivity(moveWithObjectIntent)
        }
        findViewById<FloatingActionButton>(R.id.floatingActionButton3).setOnClickListener { view ->
            val moveWithObjectIntent = Intent(this, search::class.java)
            startActivity(moveWithObjectIntent)
        }
        findViewById<FloatingActionButton>(R.id.floatingActionButton4).setOnClickListener { view ->
            val moveWithObjectIntent = Intent(this, chat::class.java)
            startActivity(moveWithObjectIntent)
        }
        findViewById<FloatingActionButton>(R.id.floatingActionButton5).setOnClickListener { view ->
            val moveWithObjectIntent = Intent(this, profil::class.java)
            startActivity(moveWithObjectIntent)
        }
    }
}