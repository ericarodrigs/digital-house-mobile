package nivel01

/*1. Faça um Programa que verifique se uma letra digitada é "F" ou "M".
     Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.*/

fun main() {

    print("Digite seu sexo biológico: ")
    val sexo = readLine()!!.toUpperCase()

    when (sexo) {
        "F" -> print("Feminino")
        "M" -> print("Masculino")
        else -> print("Outro")
    }

}