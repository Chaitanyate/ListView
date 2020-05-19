package com.example.listview

import android.graphics.Bitmap

class globals {
    companion object choice{
        var choseImage:Bitmap?=null
        fun returnImage():Bitmap{
            return choseImage!!
        }

    }
}