package com.example.financeappdesain.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.financeappdesain.R
import org.w3c.dom.Text

class LoginAcivtivityPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_acivtivity_page)
        val btnLogin = findViewById<Button>(R.id.login_btn)
        val btnReg = findViewById<TextView>(R.id.signup_btn)
        val forgotpwLink = findViewById<TextView>(R.id.linkForgotpw)
        btnLogin.setOnClickListener {
            val i = Intent(this,DashboardPage::class.java)
            startActivity(i)
            finish()
        }
        btnReg.setOnClickListener {
            val i = Intent(this,RegisterPage::class.java)
            startActivity(i)
        }
        forgotpwLink .setOnClickListener {
            val i = Intent(this,ForgotPassword::class.java)
            startActivity(i)
        }
    }
}