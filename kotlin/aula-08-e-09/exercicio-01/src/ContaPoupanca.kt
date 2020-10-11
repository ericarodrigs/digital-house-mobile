class ContaPoupanca(conta: Int, saldo: Double, val limite: Double) : ContaBancaria(conta, saldo) {

    override fun sacar(quantia: Double) {
        if (quantia <= (saldo + limite)){
            saldo -= quantia
        } else {
            println("Saldo insuficiente")
        }
    }

    override fun depositar(quantia: Double) {
        TODO("Not yet implemented")
    }
}