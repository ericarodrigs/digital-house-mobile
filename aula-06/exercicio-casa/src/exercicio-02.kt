package nivel01

/*2. Escrever o código que deve analisar duas cadeias de texto e, caso sejam diferentes,
     retornar true, ou, caso sejam iguais, retornar false.*/

fun main(){
    print("Informe um texto: ")
    val texto1 = readLine()!!

    print("Informe outro texto: ")
    val texto2 = readLine()!!

    if (textosSaoIguais(texto1, texto2)){
        println("São iguais")
    } else {
        println("São diferentes")
    }
}

fun textosSaoIguais(texto1: String, texto2: String): Boolean {
    return texto1 == texto2
}
