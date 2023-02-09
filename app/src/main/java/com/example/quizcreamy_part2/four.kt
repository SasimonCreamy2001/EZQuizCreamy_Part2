package com.example.quizcreamy_part2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_four.*

class four : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)

        a.setOnClickListener {

        }
        b.setOnClickListener {
            val intent = Intent(this@four, five::class.java)
            startActivity(intent)
        }
        c.setOnClickListener {

        }
        d.setOnClickListener {

        }
    }
}