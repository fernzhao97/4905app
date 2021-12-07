package com.abc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.*
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

open class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
       window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        val facebookBtn : ImageView = findViewById(R.id.facebookIMG)
        facebookBtn.setOnClickListener{
            val intent = Intent(this,FaceBookLoginActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_left,R.anim.stay)
        }

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
            //loginBtn

            val editTextEmail: EditText = findViewById(R.id.edit_Text_Email)
            val editPassword: EditText = findViewById(R.id.edit_Text_Password)
            when{
                TextUtils.isEmpty(editTextEmail.text.toString().trim { it <= ' ' }) ->{
                    Toast.makeText(
                        this@LoginActivity,
                        "Please enter Email",
                        Toast.LENGTH_SHORT


                    ).show()
                }

                TextUtils.isEmpty(editPassword.text.toString().trim { it <= ' ' }) ->{
                    Toast.makeText(
                        this@LoginActivity,
                        "Please create password",
                        Toast.LENGTH_SHORT


                    ).show()
                }
                else ->{
                    val email: String = editTextEmail.text.toString().trim { it <= ' ' }
                    val password: String = editPassword.text.toString().trim { it <= ' ' }

                    FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener { task ->
                            if (task.isSuccessful) {
                                val firebaseUser: FirebaseUser = task.result!!.user!!
                                Toast.makeText(
                                    this@LoginActivity,
                                    "You were Login!",
                                    Toast.LENGTH_SHORT
                                ).show()


                                // Do something in response to button click
                                val intent = Intent(this, HomeActivity::class.java)
                                intent.flags =
                                    Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                                intent.putExtra("user_id", firebaseUser.uid)
                                intent.putExtra("Email_id", email)

                                startActivity(intent)

                                overridePendingTransition(R.anim.slide_in_left, R.anim.stay)

                            } else {
                                Toast.makeText(
                                    this@LoginActivity,
                                    task.exception!!.message.toString(),
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        }


                }
            }




        }



    }

}