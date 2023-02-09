package com.example.quizcreamy_part2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_nine.*

class nine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nine)

        a.setOnClickListener {

        }
        b.setOnClickListener {

        }
        c.setOnClickListener {

        }
        d.setOnClickListener {
            val intent = Intent(this@nine, ten::class.java)
            startActivity(intent)
        }
    }
}