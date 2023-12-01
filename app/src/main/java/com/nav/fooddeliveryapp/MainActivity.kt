package com.nav.fooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var login: Button? = null
    private var register: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login = findViewById(R.id.btLogin)
        register = findViewById(R.id.btRegister)

        login?.setOnClickListener {
            val intent = Intent(this@MainActivity,SigninActivity::class.java)
            startActivity(intent)
        }

        register?.setOnClickListener {
            val intent = Intent(this@MainActivity, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}