package nivel01

/*1. Faça um programa que leia 5 números e informe o maior número.*/

fun main() {

    var maximo = 0

    for (numero in 1..5) {
        print("Informe um número: ")
        val numero = readLine()!!.toInt()
        if (numero > maximo) maximo = numero
    }
    print("Maior número é $maximo")
}