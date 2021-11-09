package com.abc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        val registerLink: TextView = findViewById(R.id.registerLink)
        registerLink.setOnClickListener {
            // Do something in response to button click
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_left,R.anim.stay)

        }
        val addIcon: ImageView = findViewById(R.id.addIcon)
        addIcon.setOnClickListener {
            // Do something in response to button click
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_left,R.anim.stay)

        }
        val loginBtn: Button = findViewById(R.id.loginButton)
        loginBtn.setOnClickListener {
            // Do something in response to button click
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_left,R.anim.stay)

        }



    }

}