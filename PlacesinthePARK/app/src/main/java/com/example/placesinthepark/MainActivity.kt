package com.example.placesinthepark

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

private var fab_add_place: FloatingActionButton? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab_add_place = findViewById(R.id.fabAddPlace)
        fab_add_place!!.setOnClickListener{
            val intent = Intent(this, AddPlaceActivity::class.java)
            startActivity(intent)

        }
    }
}