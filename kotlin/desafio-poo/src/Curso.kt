class Curso(
        val nome: String,
        var codigoDoCurso: Int,
        val quantidadeMaxAlunos: Int,
) {

    var professorTitular: ProfessorTitular? = null
    var professorAdjunto: ProfessorAdjunto? = null
    val alunos = mutableListOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        return if (alunos.size >= quantidadeMaxAlunos){
             false
        } else {
            alunos.add(umAluno)
            true
        }
    }

    fun excluirAluno(umAluno: Aluno) {
        alunos.remove(umAluno)
    }

    override fun toString(): String {
        return "Curso(nome='$nome', codigoDoCurso=$codigoDoCurso, quantidadeMaxAlunos=$quantidadeMaxAlunos, professorTitular=$professorTitular, professorAdjunto=$professorAdjunto, alunos=$alunos)"
    }


}

