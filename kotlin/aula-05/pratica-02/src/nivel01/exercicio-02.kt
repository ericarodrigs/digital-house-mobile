package nivel01

/*2. Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.*/

fun main() {

//    for (numero in 1..50) {
//        if (numero %2 != 0)
//        print("$numero ")
//    }

    for (numero in 1..50 step 2) {
        print("$numero ")
    }

}