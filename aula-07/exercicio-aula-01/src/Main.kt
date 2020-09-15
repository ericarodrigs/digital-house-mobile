fun main() {

    val cliente = Cliente()

    cliente.nome = "Erica"
    cliente.sobrenome = "Rodrigues"

    val conta = Conta()

    conta.saldo = 100.00
    conta.numeroDaConta = 1234
    conta.titular = cliente

    conta.deposito(20.00)
    conta.saque(220.00)
}