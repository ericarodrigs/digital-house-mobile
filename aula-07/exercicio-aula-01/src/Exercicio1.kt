class Exercicio1 {
    fun main() {
        val erica = Cliente()

        erica.nome = "Erica"
        erica.sobrenome = "Rodrigues"

        val contaErica = Conta()

        contaErica.saldo = 100.00
        contaErica.numeroDaConta = 1234
        contaErica.titular = erica

        contaErica.deposito(20.00)
        contaErica.saque(220.00)

        val clienteVania = Cliente()

        clienteVania.nome = "Vania"
        clienteVania.sobrenome = "Almeida"

        val contaVania = Conta()

        contaVania.saldo = 1000.00
        contaVania.numeroDaConta = 4321
        contaVania.titular = clienteVania

        contaVania.deposito(200.00)
        contaVania.saque(220.00)
    }

}