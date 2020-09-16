class Concessionaaria {
    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor: Double) {
        val venda = Venda(valor, veiculo, cliente)
        println("Venda = ${venda.cliente.nome} comprou um ${venda.veiculoVendido.modelo} por ${venda.valorDaVenda}")
    }
}