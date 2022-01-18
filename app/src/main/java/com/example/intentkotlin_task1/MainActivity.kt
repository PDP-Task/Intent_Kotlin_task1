package com.example.intentkotlin_task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn_main)

        btn.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("key","Name: Samandar, Age: 18")
            startActivity(intent)
        }
    }
}