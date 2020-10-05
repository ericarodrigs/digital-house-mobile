package com.example.calculosalario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnCalcula.setOnClickListener {
            val horasTrabalhadastoInt = edtHorasTrabalhadas.text.toString().toInt()
            val ValorHoratoInt = edtValorDaHora.text.toString().toDouble()

            val calculo =  horasTrabalhadastoInt* ValorHoratoInt

            txtSalario.text = getString(R.string.valorEmReal, calculo)
        }
    }
}