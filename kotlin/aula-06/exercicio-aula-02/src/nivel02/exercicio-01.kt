package nivel02

/*1. Uma empresa de pesquisas precisa tabular os resultados da seguinte enquete feita
     a um grande quantidade de organizações:*/

fun main() {
    val empresas = arrayListOf("Windows Server     ", "Unix               ", "Linux              ",
            "Netware            ", "Mac OS             ", "Outro              ")
    val votosPorEmpresa = arrayOf(0, 0, 0, 0, 0, 0)
    var maior = 0
    var index = 0
    do {
        println("Qual o melhor Sistema Operacional para uso em servidores?")
        println("As possíveis respostas são:\n" +
                "1- Windows Server\n" +
                "2- Unix\n" +
                "3- Linux\n" +
                "4- Netware\n" +
                "5- Mac OS\n" +
                "6- Outro")
        var voto = readLine()!!.toInt()
        when (voto) {
            0 -> break
            1, 2, 3, 4, 5, 6 -> {
                votosPorEmpresa[--voto]++
            }
            else -> println("Não é um valor válido")
        }
    } while (true)

    val votos = votosPorEmpresa.sum()

    println("Sistema Operacional     Votos   %")
    println("-------------------     -----   ---")
    for (numero in 0..5) {
        if (votosPorEmpresa[numero] > maior) {
            maior = votosPorEmpresa[numero]
            index = numero
        }
        val porcentagem = votosPorEmpresa[numero].toDouble() / votos * 100
        println(empresas[numero] + "      " + votosPorEmpresa[numero] + "   %.2f".format(porcentagem) + "%")
    }
    println("-------------------     -----   ---")
    println("Total                    $votos")
    println("O Sistema Operacional mais votado foi o " + empresas[index].trim() + ", com " + votosPorEmpresa[index] +
            " votos,\n" + "correspondendo a " +
            "%.2f".format(votosPorEmpresa[index].toDouble() / votos * 100) + "% dos votos.")
}