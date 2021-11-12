package com.abc

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

    }

}