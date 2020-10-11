class ContaCorrente(conta: Int, saldo: Double, val taxaDeOperaccao: Double) : ContaBancaria(conta, saldo) {


    override fun sacar(quantia: Double) {
        var valorTotal = quantia + taxaDeOperaccao

        if(saldo >= valorTotal) {
            println("Saldo insuficiente")
        } else {
            saldo -= valorTotal
        }
    }

    override fun depositar(quantia: Double) {
        if(quantia>=  quantia - taxaDeOperaccao) {
            saldo += quantia - taxaDeOperaccao
        }
    }
}