package nivel01

/*3. Faça um programa que receba dois números inteiros e gere os números inteiros
     que estão no intervalo compreendido por eles.*/

fun main(){
    print("Informe número um: ")
    var numeroUM = readLine()!!.toInt()
    print("Informe um número dois: ")
    var numeroDois = readLine()!!.toInt()

    if (numeroDois < numeroUM){
        val auxiliar = numeroDois
        numeroDois = numeroUM
        numeroUM = auxiliar
    }

    val numeroInicial = numeroUM + 1
    for (numero in numeroInicial until numeroDois) {
        print("$numero ")
    }
}