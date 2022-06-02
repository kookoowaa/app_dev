package com.example.placesinthepark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar

private var toolbar_add_place : Toolbar? = null

class AddPlaceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_place)
        toolbar_add_place = findViewById(R.id.toolbarAddPlace)
        setSupportActionBar(toolbar_add_place)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toolbar_add_place!!.setNavigationOnClickListener{
            onBackPressed()
        }
    }
}