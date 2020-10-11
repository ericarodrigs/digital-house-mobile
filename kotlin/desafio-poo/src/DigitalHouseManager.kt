class DigitalHouseManager {

    val alunos = mutableListOf<Aluno>()
    val professores = mutableListOf<Professro>()
    val cursos = mutableListOf<Curso>()
    val matriculas = mutableListOf<Matricula>()

    fun registrarCurso(
            nome: String,
            codigoCurso: Int,
            quantidadeMaximaDeAlunos: Int
    ) {
        val curso = Curso(nome, codigoCurso, quantidadeMaximaDeAlunos)
        cursos.add(curso)
    }

    fun excluirCurso(codigoCurso: Int) {
        val curso = buscaCurso(codigoCurso)
        cursos.remove(curso)
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String,
                                  codigoProfessor: Int, quantidadeDeHoras: Int) {
        val professorAdjunto = ProfessorAdjunto(quantidadeDeHoras, nome, sobrenome, codigoProfessor)

        professores.add(professorAdjunto)
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String,
                                  codigoProfessor: Int, especialidade: String) {
        val professorTitular = ProfessorTitular(especialidade, nome, sobrenome, codigoProfessor)

        professores.add(professorTitular)
    }

    fun excluirProfessor(codigoProfessor: Int) {
        val professro = buscaProfessor(codigoProfessor)
        professores.remove(professro)
    }

    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        val aluno = Aluno(nome, sobrenome, codigoAluno)
        alunos.add(aluno)
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        val aluno = buscarAluno(codigoAluno)
        val curso = buscaCurso(codigoCurso)

        var adicionou = false
        if (curso != null
                && aluno != null) {
            adicionou = curso.adicionarUmAluno(aluno)
        }
        if (adicionou) {
            val matricula = Matricula(aluno!!, curso!!)
            matriculas.add(matricula)
            println("Matrícula realizada!")
            println(matricula)
        } else {
            println("Não foi possível realizar a matrícula, pois não há vagas")
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int,
                          codigoProfessorAdjunto: Int) {

        val professorTitular = buscaProfessor(codigoProfessorTitular)
        val professorAdjunto = buscaProfessor(codigoProfessorAdjunto)
        val curso = buscaCurso(codigoCurso)

        if (curso != null) {
            if (professorTitular != null) {
                curso.professorTitular = professorTitular as ProfessorTitular?

            }
            if (professorAdjunto != null) {
                curso.professorAdjunto = professorAdjunto as ProfessorAdjunto?
            }
        }
        println(curso.toString())
    }

    private fun buscaCurso(codigoCurso: Int): Curso? {
        cursos.forEach {
            if (it.codigoDoCurso == codigoCurso)
                return it
        }
        return null
    }

    private fun buscaProfessor(codigoProfessor: Int): Professro? {
        professores.forEach {
            if (it.codigoDoProfessor == codigoProfessor)
                return it
        }
        return null
    }

    private fun buscarAluno(codigoAluno: Int): Aluno? {
        alunos.forEach {
            if (it.codigoAluno == codigoAluno)
                return it
        }
        return null
    }
}