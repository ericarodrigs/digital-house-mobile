fun main() {
    /*
    * 3. Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal,
    *    utilizando as seguintes fórmulas:
    *
    *   Para homens: (72.7 * h) - 58
    *   Para mulheres: (62.1 * h) - 44.7
    */

    print("Qual a altura? ")
    val altura = readLine()!!.toDouble()
    val pesoIdealHomem = (72.7 * altura) - 58
    val pesoIdealMulher = (62.1 * altura) - 44.7

    println()
    println("Peso ideal para homens é: %.2f".format(pesoIdealHomem))
    println("Peso ideal para mulheres é: %.2f".format(pesoIdealMulher))
}
