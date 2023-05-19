package com.example.bookshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonClickInsert = findViewById<Button>(R.id.insert)
        buttonClickInsert.setOnClickListener {
            val intent = Intent(this, Insert1::class.java)
            startActivity(intent)
        }

        val buttonClickDelete = findViewById<Button>(R.id.delete)
        buttonClickDelete.setOnClickListener {
            val intent = Intent(this, Deletepage::class.java)
            startActivity(intent)
        }
    }
}