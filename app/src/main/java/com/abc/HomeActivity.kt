package com.abc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val uid: TextView = findViewById(R.id.uid)
        val email:TextView=findViewById(R.id.email_id)

        val userId = intent.getStringExtra("user_id")
        val emailId = intent.getStringExtra("Email_id")


        uid.text = "User ID:: $userId"
        email.text = "Email ID:: $emailId"

        val quickSortImage: ImageView = findViewById(R.id.quickSortImage)
        quickSortImage.setOnClickListener {
            // Do something in response to button click
            val intent = Intent(this,QuickSortActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_left,R.anim.stay)

        }
        val quickSortText: TextView = findViewById(R.id.quickSortText)
        quickSortText.setOnClickListener {
            // Do something in response to button click
            val intent = Intent(this,QuickSortActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_left,R.anim.stay)

        }

    }


}