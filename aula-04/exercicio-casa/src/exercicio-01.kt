fun main(){

    /*
    * 1. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
    */

    print("Informe a primeira nota: ")
    val nota1 = readLine()!!.toDouble()
    print("Informe a segunda nota: ")
    val nota2 = readLine()!!.toDouble()
    print("Informe a terceira nota: ")
    val nota3 = readLine()!!.toDouble()
    print("Informe a quarta nota: ")
    val nota4 = readLine()!!.toDouble()

    val somaDasNotas = nota1 + nota2 + nota3 + nota4
    val totalDeNotas = 4
    val media = somaDasNotas / totalDeNotas
    println()
    print("A média  das notas é %.2f".format(media))
}