package com.Kelompok_pinit.pinit1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_registrasi.*
import kotlinx.android.synthetic.main.activity_search.*

class search : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
    }
    private fun searchUser() {
        if (search1.text.toString().isEmpty()) {
            search1.error = "Please enter your searching"
            search1.requestFocus()
            return
        }
}
}