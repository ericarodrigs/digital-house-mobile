import java.time.LocalDateTime

class Matricula(
        val aluno: Aluno,
        val curso: Curso,
) {
        val dataMatricula = LocalDateTime.now()

    override fun toString(): String {
        return "Matricula(aluno=$aluno, curso=$curso, data=${dataMatricula})"
    }


}