fun main(){

    val carro = Veiculo("fiat", "palio", 2020, "branco", 10)
    val cliente = Cliente("Ana",  "Lima ", "85988888888")
    val venda = Venda(1000.0, carro, cliente)

    val concessionaaria = Concessionaaria()

    concessionaaria.registrarVenda(carro, cliente, venda.valorDaVenda)
}
