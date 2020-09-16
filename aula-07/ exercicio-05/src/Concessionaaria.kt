import java.util.ArrayList

class Concessionaaria {

    var registroDeVendas = ArrayList<Venda>()

    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor: Double) {
        val venda = Venda(valor, veiculo, cliente)
        registroDeVendas.add(venda)
        println("Venda = ${venda.cliente.nome} comprou um ${venda.veiculoVendido.modelo} por ${venda.valorDaVenda}")
        println("Você tem ${registroDeVendas.size} vendas")
    }
}