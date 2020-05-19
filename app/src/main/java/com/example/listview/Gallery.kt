package com.example.listview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_gallery.*

class Gallery : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        val intent= intent
        val name=intent.getStringExtra("name")

        val chosen=globals.choice
        val select=chosen.returnImage()
        imageView2.setImageBitmap(select)


        textView.text=name
    }
}
