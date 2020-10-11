package com.digitalhouse.fakeloginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        btnSignUpSignUp.setOnClickListener {
            finish()
        }

        cbxSingUp.setOnCheckedChangeListener { _, isChecked ->
            btnSignUpSignUp.isEnabled = isChecked
        }

        btnSignUpSignUp.setOnClickListener {
            val name = edtNameSingUp.text.toString()
            val email = edtEmailSingUp.text.toString()
            val password = edtPasswordSingUp.text.toString()

            when {
                name.isEmpty() -> {
                    edtNameSingUp.error = "Nome Vazio"
                }
                email.isEmpty() -> {
                    edtEmailSingUp.error = "E-mail Vazio"
                }
                password.isEmpty() -> {
                    edtPasswordSingUp.error = "Senha Vazio"
                }
                else -> {
                    try {
                        UserService.register(name, email, password)
                        Toast.makeText(this, "Usuário Cadastrado!", Toast.LENGTH_SHORT).show()
                        finish()
                    } catch (e: Exception) {
                        Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}