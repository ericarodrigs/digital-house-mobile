package nivel02

/*1. Faça um programa que calcule e mostre a média aritmética de N notas.*/

fun main(){

    var somaNotas = 0.0
    print("Quantas notas? ")
    val numeroDeNotas = readLine()!!.toInt()

    for(numero in 1..numeroDeNotas){
        print("Qual a nota? ")
        val nota = readLine()!!.toDouble()
        somaNotas += nota
    }
    val media =  somaNotas / numeroDeNotas
    println("Média = $media")

}