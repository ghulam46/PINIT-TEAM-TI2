package com.PINIT.pinit1

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_pinit2.*

class pinit2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pinit2)
        button2.setOnClickListener{
            val user1 = user.text.toString()
            val password = pass.text.toString()
            if (user1.isEmpty()) {
                user.error = "Prodi Tidak Boleh Kosong"
                return@setOnClickListener
            }
            val moveWithDataIntent = Intent(this@pinit2, pinit3::class.java)
            moveWithDataIntent.putExtra(pinit3.EXTRA_PRODI, user1)
            startActivity(moveWithDataIntent)
        }

            }
        }

