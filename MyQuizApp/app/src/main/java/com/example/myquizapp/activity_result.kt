package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class activity_result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView = findViewById(R.id.tv_name)
        val tvScore: TextView = findViewById(R.id.tv_score)
        val btnFinish: Button = findViewById(R.id.btn_finish)

        var mUserName: String? = ""
        var mScore: Int? = 0
        var mTotal: Int? = 0

        mUserName = intent.getStringExtra(Constants.USER_NAME)
        mScore = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        mTotal = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)

        tvName.text = mUserName
        tvScore.text = "Your score is ${mScore} out of ${mTotal}."

        btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}