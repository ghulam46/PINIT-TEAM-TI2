package com.Kelompok_pinit.pinit1

import android.R.attr
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_registrasi.*


class registrasi : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        auth = FirebaseAuth.getInstance()


        btn_create.setOnClickListener{
            registerUpUser()
            startActivity (Intent(this@registrasi, login::class.java))
            finish()
//            auth.createUserWithEmailAndPassword(registrasi_username.toString(), registrasi_password.toString())
//               .addOnCompleteListener(this) { task ->
//                   if (task.isSuccessful) {
//                       Toast.makeText(baseContext, "Authentication success.",
//                           Toast.LENGTH_SHORT).show()
//                       startActivity (Intent(this@registrasi, login::class.java))
//                       finish()
//                   } else {
//
//                       Toast.makeText(baseContext, "Authentication failed.",
//                           Toast.LENGTH_SHORT).show()
//                   }
//
//                   // ...
//               }
       }
        }
   private fun registerUpUser() {
    if (registrasi_username.text.toString().isEmpty()) {
        registrasi_username.error = "Please enter email"
        registrasi_username.requestFocus()
        return
    }
       if (registrasi_password.text.toString().isEmpty()) {
           registrasi_password.error = "Please enter password"
           registrasi_password.requestFocus()
           return
       }
  if (Patterns.EMAIL_ADDRESS.matcher(registrasi_username.text.toString()).matches()) {
        registrasi_username.error = "Please enter valid email"
      registrasi_username.requestFocus()
        return
   }

    }
    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
    }


}