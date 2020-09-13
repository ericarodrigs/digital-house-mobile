fun main() {

    //Nível 2

    /*
     * 1. Faça um Programa que peça a temperatura em graus Fahrenheit,
     * transforme e mostre a temperatura em graus Celsius.
     * Foórmula: C = 5 * ((F-32) / 9)
     */

    print("Qual a temperatura em Fahrenheit? ")
    val fahrenheit = readLine()!!.toFloat()
    val celsius = 5 * ((fahrenheit-32) / 9)
    println("A temperatura em Celsius é $celsius.")


    /*
    * 2. Faça um Programa que pergunte quanto você ganha por hora e o número de
    * horas trabalhadas no mês. Calcule e mostre o total do seu salário no
    * referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
    * 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
    *
    * salário bruto.
    * quanto pagou ao INSS. quanto pagou ao sindicato. o salário líquido.
    * calcule os descontos e o salário líquido, conforme a tabela abaixo:
    */

    print("Qual voce ganha por hora? ")
    val ganhoHora = readLine()!!.toDouble()
    print("Número de horas trabalhadas? ")
    val horasTrabalhadas = readLine()!!.toInt()

    val totalSalarioBruto = ganhoHora * horasTrabalhadas
    val impostoDeRenda = totalSalarioBruto * 0.11
    val inss = totalSalarioBruto * 0.08
    val sindicato = totalSalarioBruto * 0.05
    val totalSalarioLiquido = totalSalarioBruto - impostoDeRenda - inss - sindicato
    val totalDeDescontos = impostoDeRenda + inss + sindicato

    println("O salário  bruto é: $totalSalarioBruto")
    println("O imposto de renda é: $impostoDeRenda")
    println("O inss  é: $inss")
    println("O sindicato  é: $sindicato")
    println("O total de descontos é: $totalDeDescontos")
    println("O salário líquido do mês é: $totalSalarioLiquido")



}