package com.example.droidlogin94

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    private lateinit var txtLogin: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        txtLogin = findViewById(R.id.txt_login)
        txtLogin.setOnClickListener {
            onBackPressed()
        }
    }
}