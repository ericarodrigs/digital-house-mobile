package Exemplo3

class Quadrado(val tamanho: Int) : Forma() {

    override val lado = 4

    override fun calcularArea(): Int {
        return tamanho * tamanho
    }

}