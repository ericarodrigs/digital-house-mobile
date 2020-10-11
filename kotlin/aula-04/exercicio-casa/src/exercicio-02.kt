fun main() {

    /*
    * 2. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
    *   Calcule e mostre o total do seu salário no referido mês.
    */

    print("Quanto você ganha por hora? ")
    val valorPorHora = readLine()!!.toDouble()
    print("Qual o número de horas trabalhadas no mês? ")
    val horasNoMes = readLine()!!.toInt()

    val totalDoSalario = valorPorHora * horasNoMes

    println()
    print("O total do seu salário no referido mês é R$%.2f".format(totalDoSalario))

}