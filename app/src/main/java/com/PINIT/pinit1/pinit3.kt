package com.PINIT.pinit1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class pinit3 : AppCompatActivity() {
    companion object {
        const val EXTRA_PRODI = "extra_prodi"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pinit4)
    }
}