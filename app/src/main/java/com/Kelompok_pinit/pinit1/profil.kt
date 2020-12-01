package com.Kelompok_pinit.pinit1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class profil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        findViewById<FloatingActionButton>(R.id.imageButtonp1).setOnClickListener { view ->
            val moveWithObjectIntent = Intent(this, home::class.java)
            startActivity(moveWithObjectIntent)
        }
        findViewById<FloatingActionButton>(R.id.imageButtonp2).setOnClickListener { view ->
            val moveWithObjectIntent = Intent(this, search::class.java)
            startActivity(moveWithObjectIntent)
        }
        findViewById<FloatingActionButton>(R.id.imageButtonp3).setOnClickListener { view ->
            val moveWithObjectIntent = Intent(this, chat::class.java)
            startActivity(moveWithObjectIntent)
        }
        findViewById<FloatingActionButton>(R.id.imageButtonp44).setOnClickListener { view ->
            val moveWithObjectIntent = Intent(this, profil::class.java)
            startActivity(moveWithObjectIntent)
        }
    }
}