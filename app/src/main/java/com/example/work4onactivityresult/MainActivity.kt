package com.example.work4onactivityresult

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var Btnpage: Button =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TV1 = findViewById<TextView>(R.id.TV1)
        val TV2 = findViewById<TextView>(R.id.TV2)
        val TV3 = findViewById<TextView>(R.id.TV3)
        val TV4 = findViewById<TextView>(R.id.TV4)
        val TV5 = findViewById<TextView>(R.id.TV5)
        val TV6 = findViewById<TextView>(R.id.TV6)




        val Btnpage= findViewById(R.id.Btnpage)


        Btnpage?.setOnClickListener {




            val intent = Intent(this, MoviesActivity::class.java)


            startActivityForResult(intent, 1)





        }






    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)



        if (requestCode== 1 && resultCode== Activity.RESULT_OK)

            val textButton = data?.getStringExtra("newButton")

            Btnpage?.text=text.Button





    }















}