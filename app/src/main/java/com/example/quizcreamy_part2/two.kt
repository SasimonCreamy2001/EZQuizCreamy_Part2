package com.example.quizcreamy_part2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_two.*

class two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        d.setOnClickListener {
            val intent = Intent(this@two, three::class.java)
            startActivity(intent)
        }
    }

    fun basicAlert(view: View) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("AlertDialog")
        builder.setMessage("This answer is not correct.")
        builder.setIcon(android.R.drawable.ic_dialog_alert)

        builder.setPositiveButton("Yes"){dialogInterface, which ->
            Toast.makeText(applicationContext,"clicked yes", Toast.LENGTH_LONG).show()
            val intent = Intent(this@two, three::class.java)
            startActivity(intent)

        }

        val alertDialog: AlertDialog = builder.create()
        alertDialog.setCancelable(false)
        alertDialog.show()

    }
}