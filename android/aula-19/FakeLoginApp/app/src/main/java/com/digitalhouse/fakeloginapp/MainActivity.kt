package com.digitalhouse.fakeloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sign_up.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCreateAccount.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {
            val email = edtEmailLogin.text.toString()
            val password = edtPasswordLogin.text.toString()
            val user = UserService.logIn(email, password)

            when {
                email.isEmpty() -> {
                    edtEmailLogin.error = "Email vazio"
                }
                password.isEmpty() -> {
                    edtPasswordLogin.error = "Senha vazio"
                }
                else -> {
                    if (user != null) {
                        try {
                            val vaiWelcome = Intent(this, WelcomeActivity::class.java)
                            vaiWelcome.putExtra("NOME", user.name)
                            startActivity(vaiWelcome)
                        } catch (e: Exception) {
                            Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
                        }
                    } else {
                        Toast.makeText(this, "Usuário ou senha inválidos!", Toast.LENGTH_LONG)
                            .show()
                    }
                }
            }

        }
    }
}