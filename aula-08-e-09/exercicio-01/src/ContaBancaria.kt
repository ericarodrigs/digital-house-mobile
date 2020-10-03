abstract class ContaBancaria(private val conta: Int, protected var saldo: Double) {
    abstract fun sacar(quantia: Double)
    abstract fun depositar(quantia: Double)
}