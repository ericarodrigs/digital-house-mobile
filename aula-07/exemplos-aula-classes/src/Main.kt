fun main() {

    val cachorro = Cachorro("Ze", "Lima")

    cachorro.cor = "caramelo"
    cachorro.idade = 4

    println(cachorro)
    println(cachorro.nomeCompleto)
    println(cachorro.cor)
    println(cachorro.idade)
    println(cachorro.calculaIdade(cachorro.idade))

    val cachorro2 = Cachorro("Ana", 2012)

    println(cachorro2.toString())
}
