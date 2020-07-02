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


    var btback: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        val textu = findViewById<TextView>(R.id.textu)
        val chbt = findViewById<CheckBox>(R.id.chbt)

        val textti = findViewById<TextView>(R.id.textti)
        val chbLn = findViewById<CheckBox>(R.id.chbLn)

        val texth = findViewById<TextView>(R.id.texth)
        val chbbt = findViewById<CheckBox>(R.id.chbbt)

        val btback = findViewById<Button>(R.id.btback)


        btback.setOnClickListener {
            val tv1 = textu.text.toString()
            val cb1 = chbt.isChecked
            val tv2 = textti.text.toString()
            val cb2 = chbLn.isChecked
            val tv3 = texth.text.toString()
            val cb3 = chbbt.isChecked

            val intent = Intent(this, MainActivity::class.java)

            intent.putExtra("tv1", tv1)
            intent.putExtra("cb1 ", cb1)
            intent.putExtra("tv2 ", tv2)
            intent.putExtra("cb2 ", cb2)
            intent.putExtra("tv3 ", tv3)
            intent.putExtra("cb3 ", cb3)


            // startActivity(intent)

            startActivityForResult(intent, 1)
        }

    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode==1 && resultCode == Activity.RESULT_OK){

            val textButton = data?.getStringExtra("tvinf")

            btback.text = textButton










        }


    }
}









