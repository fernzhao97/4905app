package com.abc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView

class QuickSortActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quick_sort)
        var imageView1 : ImageView = findViewById(R.id.showQuickSort)
        var imageView2 : ImageView = findViewById(R.id.showQuickSort2)
        var prev : Button = findViewById(R.id.PrevBtn)
        var next : Button = findViewById(R.id.NextBtn)
        var i : Int =0
        var images = arrayListOf<Int>(
            R.drawable.s2,
            //R.drawable.s3,
            R.drawable.s4,
            //R.drawable.s5,
            R.drawable.s6,
            R.drawable.s7,
           // R.drawable.s8,
            R.drawable.s9,
            //R.drawable.s10,
            R.drawable.s11,
           // R.drawable.s12,
            R.drawable.s13,
            R.drawable.s14,
            R.drawable.s15,
            //R.drawable.s16,
            R.drawable.s17,
            R.drawable.s18,
            R.drawable.s19,
            R.drawable.s20,
            R.drawable.s21,
            //R.drawable.s22,
            R.drawable.s23,
            R.drawable.s24,
            R.drawable.s25,
            R.drawable.s26,
        )
        var images2 = arrayListOf<Int>(
            R.drawable.ss2,
            //R.drawable.ss3,
            R.drawable.ss4,
            //R.drawable.ss5,
            R.drawable.ss6,
            R.drawable.ss7,
            //R.drawable.ss8,
            R.drawable.ss9,
            //R.drawable.ss10,
            R.drawable.ss11,
            //R.drawable.ss12,
            R.drawable.ss13,
            R.drawable.ss14,
            R.drawable.ss15,
            //R.drawable.ss16,
            R.drawable.ss17,
            R.drawable.ss18,
            R.drawable.ss19,
            R.drawable.ss20,
            R.drawable.ss21,
            //R.drawable.ss22,
            R.drawable.ss23,
            R.drawable.ss24,
            R.drawable.ss25

        )

        prev.setOnClickListener {
            if(i>0){
                i--;
                imageView1.setImageResource(images[i])
                imageView2.setImageResource(images2[i])

            }
            else{
                Toast.makeText(
                    applicationContext, "First Image",Toast.LENGTH_SHORT
                ).show()
                i=0
            }

        }
        next.setOnClickListener {
            if(i<18){
                i++;
                imageView1.setImageResource(images[i])
                imageView2.setImageResource(images2[i])

            }
            else{
                Toast.makeText(
                    applicationContext, "Last image",Toast.LENGTH_SHORT
                ).show()
                i=18
            }

        }

    }
}