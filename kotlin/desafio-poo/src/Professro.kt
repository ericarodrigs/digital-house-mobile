abstract class Professro (
        val nome: String,
        val sobrenome: String,
        var codigoDoProfessor: Int
) {

    val tempoDeCasa = 0
    override fun toString(): String {
        return "Professro(nome='$nome', sobrenome='$sobrenome', codigoDoProfessor=$codigoDoProfessor, tempoDeCasa=$tempoDeCasa)"
    }

}


