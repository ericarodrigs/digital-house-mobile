package nivel01

//2. Faça um Programa que leia um vetor de 10 números e mostre-os na ordem inversa.

fun main(){
    val inteiros = arrayOfNulls<Int>(10)

    for(numero in 0..9){
        print("Insira um numero inteiro: ")
        inteiros[numero] = readLine()!!.toInt()
    }

    inteiros.reverse()

    inteiros.forEach { numero ->
        print("$numero ")
    }
}