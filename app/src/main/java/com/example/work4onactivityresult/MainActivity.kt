package com.example.work4onactivityresult

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var Text1: TextView? = null
    var Text2: TextView? = null
    var Text3: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Text1 = findViewById(R.id.Text1)
        Text2 = findViewById(R.id.Text2)
        Text3 = findViewById(R.id.Text3)

        val chekButton = findViewById<Button>(R.id.chekButton)

        chekButton.setOnClickListener {
            val intent = Intent(this, MoviesActivity::class.java)
            startActivityForResult(intent,1)
        }
    }



    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==1 && resultCode== Activity.RESULT_OK) {
            val TV1 = data?.getStringExtra("TV1")
            Text1?.text = TV1
            val TV2 = data?.getStringExtra("TV2")
            Text2?.text = TV2
            val TV3 = data?.getStringExtra("TV3")
            Text3?.text = TV3
        } else {
            Log.d("onActivityResult", "no data")
        }
    }



}
























