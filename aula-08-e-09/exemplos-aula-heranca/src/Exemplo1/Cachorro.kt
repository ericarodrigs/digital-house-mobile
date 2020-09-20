package Exemplo1

import Exemplo1.Animal

class Cachorro(raca: String, idade: Int, val cor: String): Animal(raca, idade) {

    override fun comer() {
        println("cachorro comer")
    }
}