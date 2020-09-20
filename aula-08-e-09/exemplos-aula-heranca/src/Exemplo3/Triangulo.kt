package Exemplo3

class Triangulo(val base: Int, val altura: Int): Forma() {

    override val lado = 3

    override fun calcularArea(): Int {
        return (base * altura) / 2
    }
}