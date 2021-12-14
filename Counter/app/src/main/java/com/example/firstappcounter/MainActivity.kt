package com.example.firstappcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.myButton)
        val tvMyTextView =findViewById<TextView>(R.id.myTextView)
        var timesClicked : Int = 0

        btnClickMe.setOnClickListener {
            timesClicked += 1
            tvMyTextView.text = "${timesClicked} times clicked"

            Toast.makeText(this, "Hey I am a toast!", Toast.LENGTH_SHORT).show()
        }

    }
}