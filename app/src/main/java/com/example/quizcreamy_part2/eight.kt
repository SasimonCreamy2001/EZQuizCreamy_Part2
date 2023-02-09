package com.example.quizcreamy_part2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_eight.*

class eight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eight)

        a.setOnClickListener {

        }
        b.setOnClickListener {

        }
        c.setOnClickListener {
            val intent = Intent(this@eight, nine::class.java)
            startActivity(intent)
        }
        d.setOnClickListener {

        }

    }
}