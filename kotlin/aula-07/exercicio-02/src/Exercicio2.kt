fun main() {
    val jogadorZe = JogadorDeFutebol("Zé", 100, 70, 0, 50)
    val jogadoraAna = JogadorDeFutebol("Ana", 100, 90, 0, 100)

    val treinamento = SessaoDeTreinamento()

    treinamento.treinar(jogadoraAna)
    treinamento.treinar(jogadorZe)

    println(jogadoraAna.toString())
    println(jogadorZe.toString())
}