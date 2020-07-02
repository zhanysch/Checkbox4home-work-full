package com.example.work4onactivityresult

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texttv1 = findViewById<TextView>(R.id.texttv1)
        val  texttv2 = findViewById<TextView>(R.id.texttv2)
        val  texttv3 = findViewById<TextView>(R.id.texttv3)
        val  texttv4 = findViewById<TextView>(R.id.texttv4)
        val  texttv5 = findViewById<TextView>(R.id.texttv5)
        val  texttv6 = findViewById<TextView>(R.id.texttv6)

        val btn = findViewById<Button>(R.id.btnpage)


        val etData1 = intent.getStringExtra("tvinf")
        val chBox1 =  intent.getBooleanExtra("cb1",false)

        val etData2 = intent.getStringExtra("tv2")
        val chBox2 =  intent.getBooleanExtra("cb2",false)

        val etData3 = intent.getStringExtra("tv3")
        val chBox3 =  intent.getBooleanExtra("cb3",false)

        texttv1.text = etData1

        if (chBox1) {

            texttv2.text = "not choised"
        }
        else { texttv2.text = "choised"

        }

        texttv3.text = etData2

        if (chBox2) {

            texttv4.text = "not choised"
        }
        else { texttv4.text = "choised"

        }

        texttv5.text = etData3


        if (chBox3) {

            texttv6.text = "not choised"
        }
        else { texttv6.text = "choised"

        }
        

























    }




}