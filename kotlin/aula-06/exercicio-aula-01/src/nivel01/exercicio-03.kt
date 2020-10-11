package nivel01

/*
    3. Faça um Programa que peça a altura de 5 pessoas, armazene cada informação num array.
    Imprima a altura na ordem inversa a ordem lida.
*/

fun main(){
    val inteiros = arrayOfNulls<Double>(5)

    for(numero in 0..4){
        print("Insira uma atura: ")
        inteiros[numero] = readLine()!!.toDouble()
    }

    inteiros.reverse()

    inteiros.forEach { numero ->
        print("$numero ")
    }
}