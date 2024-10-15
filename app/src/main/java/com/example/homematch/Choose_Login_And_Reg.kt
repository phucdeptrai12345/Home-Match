package com.example.homematch

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class Choose_Login_And_Reg : ComponentActivity() {
    private lateinit var mLogin: Button
    private lateinit var mRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_login_and_reg)

        // Khởi tạo các nút
        mLogin = findViewById(R.id.login)
        mRegister = findViewById(R.id.register)

        // Thiết lập sự kiện click cho nút đăng nhập
        mLogin.setOnClickListener {
            val intent = Intent(this@Choose_Login_And_Reg, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Thiết lập sự kiện click cho nút đăng ký
        mRegister.setOnClickListener {
            val intent = Intent(this@Choose_Login_And_Reg, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
