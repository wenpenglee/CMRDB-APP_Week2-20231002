package com.wenpenglee.cmrdb_app_week2_20231002

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showText: TextView = findViewById(R.id.showText)
        val enterText: EditText = findViewById(R.id.enterText)
        val confirmButton: Button = findViewById(R.id.button)
        confirmButton.setOnClickListener {
            showText.text = enterText.text
        }
    }
}