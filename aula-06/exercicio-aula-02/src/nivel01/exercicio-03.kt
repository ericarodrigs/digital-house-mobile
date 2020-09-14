package nivel01

/*
    3. Faça um programa com uma função chamada somaImposto. A função possui dois parâmetros formais:
    taxaImposto, que é a quantia de imposto sobre vendas expressa em porcentagem e custo,
    que é o custo de um item antes do imposto. A função “altera” o valor de custo para incluir
    o imposto sobre vendas.
*/

fun main(){
    print("Informe uma taxa: ")
    val taxaImposto = readLine()!!.toInt()
    print("Informe um custo: ")
    val custo = readLine()!!.toInt()
    somaImposto(taxaImposto, custo)
}

fun somaImposto(taxaImposto: Int, custo: Int) {
    val total = (custo * taxaImposto ) / 100 + custo
    println("Custo total $total")
}
