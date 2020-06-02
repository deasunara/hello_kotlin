package com.deasunara.hellokotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

        val Nama = editText1.text.toString()
        val Nim = editText2.text.toString()


        val intent = Intent (this@MainActivity, secondActivity::class.java)
        intent.putExtra("Nama", Nama)
        intent.putExtra("Nim", Nim)
        startActivity(intent)

        }
    }
}
