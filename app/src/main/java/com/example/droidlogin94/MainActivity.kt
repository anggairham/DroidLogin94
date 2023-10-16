package com.example.droidlogin94

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var imgStart: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imgStart = findViewById(R.id.img_start)
        imgStart.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view?.id == R.id.img_start){
            val moveIntent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(moveIntent)
            finish()
        }
    }
}