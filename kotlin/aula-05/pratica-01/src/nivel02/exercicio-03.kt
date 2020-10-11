package nivel02

/*3. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
     "Telefonou para a vítima?"
     "Esteve no local do crime?"
     "Mora perto da vítima?"
     "Devia para a vítima?"
     "Já trabalhou com a vítima?"

     O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
      Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
      entre 3 e 4 como "Cúmplice" e
      5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
     */

fun main() {

     var respostas = 0
     print("Telefonou para a vítima? (s ou n)")
     val pergunta1 = readLine()!!.toUpperCase()
     if (pergunta1 == "S") respostas++
     print("Esteve no local do crime?  (s ou n)")
     val pergunta2 = readLine()!!.toUpperCase()
     if (pergunta2 == "S") respostas++
     print("Mora perto da vítima?  (s ou n)")
     val pergunta3 = readLine()!!.toUpperCase()
     if (pergunta3 == "S") respostas++
     print("Devia para a vítima?  (s ou n)")
     val pergunta4 = readLine()!!.toUpperCase()
     if (pergunta4 == "S") respostas++
     print("Já trabalhou com a vítima?  (s ou n)")
     val pergunta5 = readLine()!!.toUpperCase()
     if (pergunta5 == "S") respostas++


     when (respostas) {
         5 -> print("Assassino")
         3, 4 -> print("Cúmplice")
         2 -> print("Suspeita")
         else -> print("Inocente")
     }
}