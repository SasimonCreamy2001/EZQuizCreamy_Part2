package com.example.quizcreamy_part2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ten.*

class ten : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ten)

        a.setOnClickListener {

        }
        b.setOnClickListener {
            val intent = Intent(this@ten, MainActivity::class.java)
            startActivity(intent)
        }
        c.setOnClickListener {

        }
        d.setOnClickListener {

        }

    }
}