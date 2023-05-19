package com.example.bookshop

import android.R.*
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Insert1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val authorInput = findViewById<View>(R.id.author_text) as TextView
        authorInput.setText(R.string./*-------------------------------------------------*/)

        val bookInput = findViewById<View>(R.id.book_text) as TextView
        bookInput.setText(R.string./*---------------------------------------------------*/)

        val priceInput = findViewById<View>(R.id.price_i) as TextView
        priceInput.setText(R.string./*---------------------------------------------------*/)

        val buttonClickInsertPage2 = findViewById<Button>(R.id.insert_button)
        buttonClickInsertPage2.setOnClickListener {
            val intent = Intent(this, Insert2::class.java)
            startActivity(intent)
        }


        var options = arrayOf("دين","تعليم","صحة")
        val spinnerVal : Spinner = findViewById(R.id.book_contnet)
        spinnerVal.adapter = ArrayAdapter<String>(this, layout.simple_list_item_1,options )
       // setContentView(R.layout.`Insert1`)
    }


}