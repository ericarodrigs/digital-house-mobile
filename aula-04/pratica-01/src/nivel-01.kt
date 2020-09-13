fun main(){

    // Nível 1

    /*
     * Faça um Programa que peça um número e então mostre a mensagem: O número informado foi [número].
     */


    print("Informe um numero: ")
    val numero = readLine()!!.toInt()
    println("O número é: $numero.")

    /*
     * 2. Faça um Programa que peça dois números e imprima a soma.
    */

    print("Informe o numero 1: ")
    val numero1 = readLine()!!.toInt()
    print("Informe o numero 2: ")
    val numero2 = readLine()!!.toInt()
    println(numero1 + numero2)

    /*
    * 3. Faça um Programa que converta metros para centímetros.
    */


    print("Informe o valor em metros: ")
    val metros = readLine()!!.toInt()
    val centimentro = metros * 100
    println("O valor em centimetros é: $centimentro.")

}