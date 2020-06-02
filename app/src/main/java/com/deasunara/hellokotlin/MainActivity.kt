package com.deasunara.hellokotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEt = findViewById<EditText>(R.id.etName)
        val nimEt = findViewById<EditText>(R.id.etNim)
        val submitBtn = findViewById<Button>(R.id.btnSubmit)

        submitBtn.setOnClickListener {
            val nama = nameEt.text.toString()
            val nim = nimEt.text.toString()

            println(nama)
            print(nim)

            val intent = Intent (this@MainActivity, secondActivity::class.java)
            intent.putExtra("Name", nama)
            intent.putExtra("Nim", nim)
            startActivity(intent)

        }
    }
}
