package com.example.calculosalario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnCalcula.setOnClickListener {
            if(edtHorasTrabalhadas.text.toString().isNotEmpty() &&
                edtValorDaHora.text.toString().isNotEmpty()){

                val horasTrabalhadasToInt = edtHorasTrabalhadas.text.toString().toInt()
                val ValorHoraToInt = edtValorDaHora.text.toString().toDouble()

                val calculo =  horasTrabalhadasToInt * ValorHoraToInt

                txtSalario.text = getString(R.string.valorEmReal, calculo)
            }
        }
    }
}