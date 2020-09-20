package Exemplo1

import Exemplo1.Cachorro

fun main(){

    val dog = Cachorro("doguinho", 10, "amarelo")

    println(dog.idade)
    println(dog.raca)
    dog.comer()
    dog.correr()

   val dog2 = Cachorro("doguinho2", 101, "amarelo2")

    println(dog2.idade)
    println(dog2.raca)
    dog2.comer()
    dog2.correr()
}