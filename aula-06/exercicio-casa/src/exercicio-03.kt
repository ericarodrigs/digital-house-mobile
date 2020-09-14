package nivel01

/*
    3. Escrever o código que deve analisar um número inteiro e, caso ele seja par,
     retornar true, caso contrário, retorna false.
*/

fun main(){
    print("Informe um número: ")
    val numero = readLine()!!.toInt()

    if (ehPar(numero)) {
        println("É par")
    }else {
        println("É ímpar")
    }
}

fun ehPar(numero: Int): Boolean {
    return numero % 2 == 0
}
