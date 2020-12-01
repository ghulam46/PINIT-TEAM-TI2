package com.Kelompok_pinit.pinit1

import android.R.attr
import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_registrasi.*


class login : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = Firebase.auth

        btn_login.setOnClickListener{
        do_login()
            startActivity (Intent(this@login, home::class.java))
                        finish()

//            auth.signInWithEmailAndPassword(login_username.text.toString(), login_password.text.toString())
//                .addOnCompleteListener(this) { task ->
//                    if (task.isSuccessful) {
//
//                        //val user = auth.currentUser
//                        startActivity (Intent(this@login, home::class.java))
//                        finish()
//                    } else {
//
//                        Toast.makeText(baseContext, "Authentication failed.",
//                            Toast.LENGTH_SHORT).show()
//                        // ...
//                    }
//
//                    // ...
//                }
        }
    }

    private fun do_login() {
        if (login_username.text.toString().isEmpty()) {
            login_username.error = "Please enter email"
            login_username.requestFocus()
            return
        }
        if (Patterns.EMAIL_ADDRESS.matcher(login_username.text.toString()).matches()) {
            login_username.error = "Please enter valid email"
            login_username.requestFocus()
            return
        }
        if (login_password.text.toString().isEmpty()) {
            login_password.error = "Please enter password"
            login_password.requestFocus()
            return
        }
    }


public override fun onStart() {
    super.onStart()
    // Check if user is signed in (non-null) and update UI accordingly.
    val currentUser = auth.currentUser
}


}