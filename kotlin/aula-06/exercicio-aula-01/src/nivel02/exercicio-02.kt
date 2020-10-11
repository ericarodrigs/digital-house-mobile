package nivel02

/*2. Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a
     valor do saque e depois informar quantas notas de cada valor serão fornecidas.
     As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais
     e o máximo de 600 reais. O programa não deve se preocupar com a quantidade de notas existentes na máquina.*/

fun main() {
    val quantidadeCedulas = arrayOf(0, 0, 0, 0, 0)
    val cedulas = arrayOf(1, 5, 10, 50, 100)

    print("Qual o valor do saque? ")
    var valorSaque = readLine()!!.toInt()

    if (valorSaque in 10..600) {
        for (numero in 4 downTo 0) {
            quantidadeCedulas[numero] = valorSaque / cedulas[numero]
            valorSaque %= cedulas[numero]
            println("" + quantidadeCedulas[numero] + " nota(s) de " + cedulas[numero])
        }
    } else {
        println("Valor não permitido")
    }

}