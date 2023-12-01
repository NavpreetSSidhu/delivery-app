package com.nav.fooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignupActivity : AppCompatActivity() {
    private var login: TextView? = null
    private var btnLogin: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        login = findViewById(R.id.tvLogin)
        btnLogin = findViewById(R.id.btRegisterN)
        login?.setOnClickListener {
            val intent = Intent(this@SignupActivity, SigninActivity::class.java)
            startActivity(intent)
        }

        btnLogin?.setOnClickListener {
            val intent = Intent(this@SignupActivity, SigninActivity::class.java)
            startActivity(intent)
        }
    }
}