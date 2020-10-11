package nivel01

import kotlin.random.Random

/*
    5. Escrever um código que deve analisar quatro números inteiros e, caso numA seja maior que numC
     e numD ou caso numB seja maior que numC e numD, retornar true, caso contrário, retornar false.
*/

fun main() {
    print("Informe número A: ")
    val numeroA = readLine()!!.toInt()
    print("Informe número B: ")
    val numeroB = readLine()!!.toInt()
    print("Informe número C: ")
    val numeroC = readLine()!!.toInt()
    print("Informe número D: ")
    val numeroD = readLine()!!.toInt()


    if (analiseNumeros(numeroA, numeroB, numeroC, numeroD)){
        println("Análise verdadeira")
    }else {
        println("Análise falsa")
    }

}

fun analiseNumeros(numeroA: Int, numeroB: Int, numeroC: Int, numeroD: Int): Boolean {
    return (numeroA > numeroC && numeroA > numeroD
            || numeroB > numeroC && numeroB > numeroC)
}


