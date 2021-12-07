package com.abc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.*
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser


class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

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
            //registerBtn

            val editTextEmail: EditText = findViewById(R.id.edit_Text_Email)
            val editName: EditText = findViewById(R.id.editTextName)
            val editPhone: EditText = findViewById(R.id.editTextMobile)
            val editPassword: EditText = findViewById(R.id.edit_Text_Password)
            when{
                TextUtils.isEmpty(editTextEmail.text.toString().trim { it <= ' ' }) ->{
                    Toast.makeText(
                        this@RegisterActivity,
                        "Please enter Email",
                        Toast.LENGTH_SHORT


                    ).show()
                }
                TextUtils.isEmpty(editName.text.toString().trim { it <= ' ' }) ->{
                    Toast.makeText(
                        this@RegisterActivity,
                        "Please enter Name",
                        Toast.LENGTH_SHORT


                    ).show()
                }
                TextUtils.isEmpty(editPhone.text.toString().trim { it <= ' ' }) ->{
                    Toast.makeText(
                        this@RegisterActivity,
                        "Please enter your phone number",
                        Toast.LENGTH_SHORT


                    ).show()
                }
                TextUtils.isEmpty(editPassword.text.toString().trim { it <= ' ' }) ->{
                    Toast.makeText(
                        this@RegisterActivity,
                        "Please create password",
                        Toast.LENGTH_SHORT


                    ).show()
                }
                else ->{
                    val email: String = editTextEmail.text.toString().trim { it <= ' ' }
                    val name: String = editName.text.toString().trim { it <= ' ' }
                    val phone: String = editPhone.text.toString().trim { it <= ' ' }
                    val password: String = editPassword.text.toString().trim { it <= ' ' }

                    FirebaseAuth.getInstance().createUserWithEmailAndPassword(email,password)
                        .addOnCompleteListener { task ->
                            if (task.isSuccessful) {
                                val firebaseUser: FirebaseUser = task.result!!.user!!


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
                                    this@RegisterActivity,
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