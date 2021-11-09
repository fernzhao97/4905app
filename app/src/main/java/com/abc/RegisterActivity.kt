package com.abc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val backLink: ImageView = findViewById(R.id.backLink)
        backLink.setOnClickListener {
            // Do something in response to button click
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_left,R.anim.stay)

        }

        val back2btn: TextView = findViewById(R.id.back2btn)
        back2btn.setOnClickListener {
            // Do something in response to button click
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_left,R.anim.stay)

        }

        val registerBtn: Button = findViewById(R.id.registerButton)
        registerBtn.setOnClickListener {
            // Do something in response to button click
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_left,R.anim.stay)

        }
    }
}