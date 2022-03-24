package com.best.mytask1

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    var TAG = MainActivity2::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        data()
    }

    fun data() {
        val txtButton =findViewById<TextView>(R.id.txtBtn2)
        val name = intent.getStringExtra("name")
        Log.d(TAG, name!!)
        txtButton.text = name
    }
}