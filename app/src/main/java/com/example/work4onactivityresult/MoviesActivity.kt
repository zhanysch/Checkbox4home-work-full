package com.example.work4onactivityresult

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_movies.*

class MoviesActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        val btnSaveResult = findViewById<Button>(R.id.btnBack)
        val cbMovie1 = findViewById<CheckBox>(R.id.cb1)
        val cbMovie2 = findViewById<CheckBox>(R.id.cb2)
        val cbMovie3 = findViewById<CheckBox>(R.id.cb3)

        var TV1: String? = null
        var TV2: String? = null
        var TV3: String? = null

        btnSaveResult.setOnClickListener {

            val intent = Intent()

            if (cb1.isChecked)
            {TV1 = cb1.text.toString()}
            else
            {TV1 = "не готов"}

            if (cb2.isChecked)
            {TV2 = cb2.text.toString()}
            else
            {TV2 = "не готов"}

            if (cb3.isChecked)
            {TV3 = cb3.text.toString()}
            else
            {TV3 = "не готов"}

            intent.putExtra("TV1", TV1)
            intent.putExtra("TV2", TV2)
            intent.putExtra("TV3", TV3)

            setResult(Activity.RESULT_OK, intent)
            finish()
        }









        }



    }




















