package com.deasunara.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*

class secondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = intent
        val nama = intent.getStringExtra("Name")
        val nim = intent.getStringExtra("Nim")

        println(nama)
        println(nim)

        val nameResult = findViewById<TextView>(R.id.resultName)
        val nimResult = findViewById<TextView>(R.id.resultNim)
        resultName.text = "Name: "+nama
        resultNim.text = "Nim: "+nim

    }
}
