package com.Kelompok_pinit.pinit1

import android.app.Activity
import android.app.Instrumentation
import android.app.ProgressDialog
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.activity_isi_foto_activity.*
import java.net.URL
import java.security.cert.CertPath

class isi_foto_activity : AppCompatActivity() {

    lateinit var  filepath: Uri
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isi_foto_activity)

        btn_Choose.setOnClickListener(){
            starFileChooser()
        }

        btn_Upload.setOnClickListener(){
            uploadFile()
        }
    }

    private fun uploadFile() {
        if (filepath!=null){
            var pd = ProgressDialog(this)
            pd.setTitle("Uploading")
            pd.show()

          var imageRef = FirebaseStorage.getInstance().reference.child("images/pic.jpg")
      imageRef.putFile(filepath)
          .addOnSuccessListener {p0->
                pd.dismiss()
              Toast.makeText(applicationContext,"File Uploaded",Toast.LENGTH_LONG).show()
          }
          .addOnFailureListener(){p0->
              pd.dismiss()
              Toast.makeText(applicationContext,p0.message,Toast.LENGTH_LONG).show()

          }
          .addOnProgressListener { p0->
              var progress = (100.0 * p0.bytesTransferred) / p0.totalByteCount
              pd.setMessage("Uploaded ${progress.toInt()}% ")

          }
        }
    }

    private fun starFileChooser() {
        var i = Intent()
        i.setType("image/*")
        i.setAction(Intent.ACTION_GET_CONTENT)
        startActivityForResult(Intent.createChooser(i,"Choose Pictures"),111)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==111 && resultCode == Activity.RESULT_OK && data != null){
        filepath = data.data!!
            var bitmap : Bitmap  = MediaStore.Images.Media.getBitmap(contentResolver,filepath)
            imageView4.setImageBitmap(bitmap)
    }}


}