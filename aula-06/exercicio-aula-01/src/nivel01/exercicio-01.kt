package nivel01

//1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.

fun main() {
    val inteiros = arrayOfNulls<Int>(5)

    for (numero in 0..4) {
        print("Insira um numero inteiro: ")
        inteiros[numero] = readLine()!!.toInt()
    }

    inteiros.forEach { numero ->
        print("$numero ")
    }

}