package nivel01

import kotlin.random.Random

/*
    4. Jogo de Craps. Faça um programa de implemente um jogo de Craps.
    O jogador lança um par de dados, obtendo um valor entre 2 e 12.
    Se, na primeira jogada, você tirar 7 ou 11, você um "natural" e ganhou.
    Se você tirar 2, 3 ou 12 na primeira jogada, isto é chamado de "craps" e você perdeu.
    Se, na primeira jogada, você fez um 4, 5, 6, 8, 9 ou 10,este é seu "Ponto".
    Seu objetivo agora é continuar jogando os dados até tirar este número novamente.
    Você perde, no entanto, se tirar um 7 antes de tirar este Ponto novamente. Exemplo:

*/

fun main() {
    do {
        println("Rolar dados? (s ou n)")
        val jogar = readLine()!!.toLowerCase()

        if (jogar == "s") {
            when (val valorDado = valorDoDado()) {
                7, 11 -> {
                    mensagemDeGanhou(valorDado)
                }
                2, 3, 12 -> {
                    mensagemDePerdeu(valorDado)
                }
                4, 5, 6, 8, 9, 10 -> {
                    jogarNovamente(valorDado, valorDado)
                }
            }
        } else {
            println("O jogo acabou")
            break
        }
    } while (true)
}

fun jogarNovamente(valorTirado: Int, valorAuxiliar: Int) {
    print("Você tirou $valorAuxiliar! Aperte enter para tentar novamente")
    readLine()
    when (val valorDado = valorDoDado()) {
        7 -> {
            mensagemDePerdeu(valorDado)
        }
        valorTirado -> {
            mensagemDeGanhou(valorDado)
        }
        else -> jogarNovamente(valorTirado, valorDado)
    }

}

private fun valorDoDado(): Int {
    return Random.nextInt(2, 12)
}

private fun mensagemDeGanhou(valorDado: Int) {
    println("Você tirou $valorDado! Parabéns você ganhou!")
    println()
}

private fun mensagemDePerdeu(valorDado: Int) {
    println("Você tirou $valorDado! Você perdeu =(")
    println()
}

