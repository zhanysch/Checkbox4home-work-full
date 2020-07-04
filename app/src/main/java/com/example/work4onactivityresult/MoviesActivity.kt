package com.example.work4onactivityresult

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MoviesActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)




            val Texttv1 = findViewById<TextView>(R.id.Texttv1)
            val chbox1= findViewById<CheckBox>(R.id.chbox1)

            val Texttv2= findViewById<TextView>(R.id.Texttv2)
            val chbox2 = findViewById<CheckBox>(R.id.chbox2)

            val Texttv3 = findViewById<TextView>(R.id.Texttv3)
            val chbbt = findViewById<CheckBox>(R.id.chbbt)

            val btback = findViewById<Button>(R.id.btback)


            btback.setOnClickListener {
                val textFromTV1 = Texttv1.text.toString()

                intent.putExtra("textFrom1", textFromTV1 )

                val textFromTV2 = Texttv2.text.toString()
                intent.putExtra("textFrom2",textFromTV2)

                val textFromTV3 = Texttv3.text.toString()
                intent.putExtra("TextFrom3",textFromTV3)

                val cbinfo1 = chbox1.isChecked
                val cbinfo2= chbox2.isChecked
                val cbinfo3 = chbbt.isChecked

                intent.putExtra("cbinfo1",cbinfo1)
                intent.putExtra("cbinfo2",cbinfo2)
                intent.putExtra("cbinfo3",cbinfo3)



                val intent = Intent()







                setResult(Activity.RESULT_OK,intent)
                finish()


            }

        }



    }




















