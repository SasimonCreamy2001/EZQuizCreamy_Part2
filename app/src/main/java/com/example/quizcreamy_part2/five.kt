package com.example.quizcreamy_part2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_five.*

class five : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)

        a.setOnClickListener {
            val intent = Intent(this@five, six::class.java)
            startActivity(intent)
        }
        b.setOnClickListener {

        }
        c.setOnClickListener {

        }
        d.setOnClickListener {

        }
    }
}