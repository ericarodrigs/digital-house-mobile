package com.example.conversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConverter.setOnClickListener {
            val temptoInt = edtTemperatura.text.toString().toInt()

            val tempEmFahrenheit = (temptoInt * 9 / 5 ) + 32

            txtTempEmF.text = getString(R.string.em_fahrenheit, tempEmFahrenheit)

        }

    }
}

