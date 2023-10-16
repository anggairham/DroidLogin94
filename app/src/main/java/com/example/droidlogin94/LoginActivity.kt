package com.example.droidlogin94

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    private lateinit var txtRegister: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        txtRegister = findViewById(R.id.txt_register)
        txtRegister.setOnClickListener {
            val moveIntent = Intent(this@LoginActivity,RegisterActivity::class.java)
            startActivity(moveIntent)
        }
    }
}