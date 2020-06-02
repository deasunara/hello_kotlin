package com.deasunara.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class secondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = intent
        val nama = intent.getStringArrayExtra("name")
        val nim = intent.getStringArrayExtra("Nim")

        val resultTv = findViewById<TextView>(R.id.resultTv)
        resultTv.text = "Name: "+nama+"\nNim: "+nim
    }
}
