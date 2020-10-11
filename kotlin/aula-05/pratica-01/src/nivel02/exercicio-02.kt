package nivel02

/*2. Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque
     e depois informar quantas notas de cada valor serão fornecidas.
     As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais.
     O valor mínimo é de 10 reais e o máximo de 600 reais.
     O programa não deve se preocupar com a quantidade de notas existentes na máquina.*/

fun main() {

    print("Qual o valor do saque? ")
    val valorSaque = readLine()!!.toInt()

    if (valorSaque in 10..600) {
        val notas100 = valorSaque / 100
        var valorSobra = valorSaque % 100
        val notas50 = valorSobra / 50
        valorSobra %= 50
        val notas10 = valorSobra / 10
        valorSobra %= 10
        val notas5 = valorSobra / 5
        valorSobra %= 5
        val notas1 = valorSobra
        println("$notas100 nota(s) de 100, " +
                "$notas50 nota(s) de 50, " +
                "$notas10 nota(s) de 10, " +
                "$notas5 nota(s) 5, " +
                "$notas1 nota(s) de 1")
    } else {
        println("Valor não permitido")
    }
}