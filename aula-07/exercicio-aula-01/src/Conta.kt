class Conta {

    var numeroDaConta: Int = 0
    var saldo: Double = 0.0
    var titular: Cliente = Cliente()


    fun deposito(quantidaDeDinheiro: Double) {
        saldo += quantidaDeDinheiro
        println("Transação de depósito realizada! Novo saldo de: R$ %.2f".format(saldo))
    }

    fun saque(quantiaEmDinheiro: Double) {
        if (saldo >= quantiaEmDinheiro){
            saldo -= quantiaEmDinheiro
            println("Transação de saque realizada! Novo saldo de: R$ %.2f".format(saldo))
        } else {
            println("Saldo insuficiente.")
        }
    }

}