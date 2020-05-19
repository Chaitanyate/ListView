package com.example.listview

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         var land=ArrayList<String>()
        land.add("pisa")
        land.add("Taj")
        land.add("Eeifel")
        land.add("India_Gate")


        val a=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.alvas)
        val b=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.login)
        val c=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.images)

        val d=ArrayList<Bitmap>()
        d.add(a)
        d.add(b)
        d.add(c)






        var adapt=ArrayAdapter(this,android.R.layout.simple_list_item_1,land)

        list.adapter=adapt
        list.onItemClickListener=AdapterView.OnItemClickListener { parent, view, position, id ->

            val intent=Intent(applicationContext,Gallery::class.java)
            intent.putExtra("name",land[position])

            val bitmap=d[position]
            val chosen=globals.choice
            chosen.choseImage=bitmap
            startActivity(intent)

        }
    }
}
