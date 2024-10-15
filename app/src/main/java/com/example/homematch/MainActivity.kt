package com.example.homematch

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity // Sử dụng AppCompatActivity

class MainActivity : AppCompatActivity() { // Kế thừa từ AppCompatActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ẩn ActionBar
        supportActionBar?.hide()

        // Chuyển thẳng từ MainActivity sang Choose_Login_And_Reg
        val intent = Intent(this@MainActivity, Choose_Login_And_Reg::class.java)
        startActivity(intent)
        finish()  // Kết thúc MainActivity để nó không còn trong stack
    }
}
