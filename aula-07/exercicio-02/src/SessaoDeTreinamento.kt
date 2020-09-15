class SessaoDeTreinamento {

    fun treinar(jogador: JogadorDeFutebol) {
        println("Experiência de ${jogador.nome} inicialmente é: ${jogador.experiencia}")
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        jogador.experiencia++
        println("Experiência de  ${jogador.nome} ao final do treinamento é: ${jogador.experiencia}")
    }
}