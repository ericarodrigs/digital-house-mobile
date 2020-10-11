fun main() {
    val meuArray = arrayOf("peixe", "jacaré", "jararaca")


    meuArray.forEach { elemento -> println(elemento) }

    println()

    for (elemento in meuArray) {
        println(elemento)
    }
}