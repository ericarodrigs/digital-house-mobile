package nivel02

/*2. Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs
     e o valor médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs
     e o valor para em cada um.*/

fun main() {

    var somaValorCds = 0.0
    print("Quantidade de CDs? ")
    val quantidadeDeCds = readLine()!!.toInt()

    for(numero in 1..quantidadeDeCds){
        print("Qual o valor do CD $numero? ")
        val valorCD = readLine()!!.toDouble()
        somaValorCds += valorCD
    }
    val media =  somaValorCds / quantidadeDeCds

    println("Valor médio por CD é de R\$ " + "%.2f".format(media))
    println("A coleção de $quantidadeDeCds CDs tem o valor total de R\$ " + "%.2f".format(somaValorCds))

}