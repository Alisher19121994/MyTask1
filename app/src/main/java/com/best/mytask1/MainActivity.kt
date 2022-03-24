package com.best.mytask1

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            open()
        }
    }
    fun open() {
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("name", "Alisher 27")
      startActivity(intent)
    }
}