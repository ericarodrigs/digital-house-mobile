package nivel02

/*3. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
     O usuário deve informar de qual número ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
     */

fun main() {

     print("Qual tabuada você quer gerar? ")
     val valorTabuada = readLine()!!.toInt();

     for(numero in 1..10){
          println("$valorTabuada X $numero = " + valorTabuada * numero)
     }
}