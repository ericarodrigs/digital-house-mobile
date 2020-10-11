class Carro(
    var consumo: Int,
) {
    var combustivel: Int = 0

    fun andar(distanciaEmKm: Int) {
        val combustivelNecessario = distanciaEmKm / consumo
        if (combustivel >= combustivelNecessario ) {
            combustivel -= distanciaEmKm / consumo
        } else {
            println("Você não tem combustível suficiente")
        }
    }

    fun obterGasolina(){
        println("Combustível atual: $combustivel")
    }

    fun adicionarGasolina(litrosAbastecimento: Int){
        combustivel += litrosAbastecimento
    }
}



