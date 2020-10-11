class Prova(
    var dificuldade: Int,
    var energiaNecessaria: Int
) {
    fun realizarProva(atleta: Atleta): Boolean {
        if (atleta.nivel >= dificuldade &&
            atleta.energia >= energiaNecessaria
        ) {
            atleta.energia -=  energiaNecessaria
            println("${atleta.nome} pode realizar está prova, nova energia = ${atleta.energia}")
            return true
        } else {
            println("${atleta.nome} não pode realizar está prova")
            return false
        }
    }
}