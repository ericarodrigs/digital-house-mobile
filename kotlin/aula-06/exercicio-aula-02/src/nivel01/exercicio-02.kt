package nivel01

/*2. Faça um programa, com uma função que necessite de um argumento.
     A função retorna o valor de caractere ‘P’, se seu argumento for positivo,
     e ‘N’, se seu argumento for zero ou negativo.*/

fun main(){
    print("Informe um valor: ")
    val numero = readLine()!!.toInt()
    positivoOuNegativo(numero)
}

fun positivoOuNegativo(numero: Int) {
    if (ehPositivo(numero)) {
        println("P")
    } else {
        println("N")
    }
}

fun ehPositivo(numero: Int): Boolean {
    return numero > 0
}
