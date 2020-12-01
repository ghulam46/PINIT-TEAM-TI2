package com.Kelompok_pinit.pinit1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class chat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        findViewById<FloatingActionButton>(R.id.imageButton8).setOnClickListener { view ->
            val moveWithObjectIntent = Intent(this, home::class.java)
            startActivity(moveWithObjectIntent)
        }
        findViewById<FloatingActionButton>(R.id.imageButton9).setOnClickListener { view ->
            val moveWithObjectIntent = Intent(this, search::class.java)
            startActivity(moveWithObjectIntent)
        }
        findViewById<FloatingActionButton>(R.id.imageButton10).setOnClickListener { view ->
            val moveWithObjectIntent = Intent(this, chat::class.java)
            startActivity(moveWithObjectIntent)
        }
        findViewById<FloatingActionButton>(R.id.imageButton11).setOnClickListener { view ->
            val moveWithObjectIntent = Intent(this, profil::class.java)
            startActivity(moveWithObjectIntent)
        }
    }
}