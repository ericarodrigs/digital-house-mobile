fun main() {

    val digitalHouseManager = DigitalHouseManager()

    digitalHouseManager.registrarAluno("erica", "rodrigues", 1)
    digitalHouseManager.registrarCurso("logica" ,1, 5)

    digitalHouseManager.matricularAluno(1, 1)

    digitalHouseManager.registrarAluno("erica2", "rodrigues2", 2)
    digitalHouseManager.registrarAluno("erica2", "rodrigues2", 3)
    digitalHouseManager.registrarAluno("erica2", "rodrigues2", 4)
    digitalHouseManager.registrarAluno("erica2", "rodrigues2", 5)
    digitalHouseManager.registrarAluno("erica2", "rodrigues2", 6)

    digitalHouseManager.matricularAluno(2, 1)
    digitalHouseManager.matricularAluno(3, 1)
    digitalHouseManager.matricularAluno(4, 1)
    digitalHouseManager.matricularAluno(5, 1)
    digitalHouseManager.matricularAluno(6, 1)


    digitalHouseManager.registrarProfessorAdjunto("professor", "adjunto", 1, 10)
    digitalHouseManager.registrarProfessorAdjunto("professor2", "adjunto2", 2, 10)
    digitalHouseManager.registrarProfessorTitular("proffy", "titular", 3, "poo")
    digitalHouseManager.registrarProfessorTitular("proffy", "titular", 4, "poo2")

    println(digitalHouseManager.professores)
    digitalHouseManager.alocarProfessores(1, 3, 1)
    digitalHouseManager.registrarCurso("logica2" ,2, 5)

    println("------------------")
    println("Tamanho do array de cursos: ${digitalHouseManager.cursos.size}")
    println("Remove curso")
    digitalHouseManager.excluirCurso(2)
    println("Tamanho do array de cursos: ${digitalHouseManager.cursos.size}")
    println("------------------")
    println("Tamanho do array de professores ${digitalHouseManager.professores.size} ")
    println("Remove professor")
    digitalHouseManager.excluirProfessor(4)
    println("Tamanho do array de professores ${digitalHouseManager.professores.size} ")
    println("------------------")

}
