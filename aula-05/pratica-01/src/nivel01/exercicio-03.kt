package nivel01

/*3. Faça um programa para a leitura de duas notas parciais de um aluno.
     O programa deve calcular a média alcançada por aluno e apresentar:
     A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
     A mensagem "Reprovado", se a média for menor do que sete;
     A mensagem "Aprovado com Distinção", se a média for igual a dez.*/

fun main(){
    print("Digite a nota um: ")
    val notaUm = readLine()!!.toDouble()
    print("Digite a nota dois: ")
    val notaDois = readLine()!!.toDouble()
    var media = (notaUm + notaDois)/2

    if (media >= 10.00){
        media = 10.00
    }

    when {
        media == 10.00 -> {
            print("Aprovado com Distinção")
        }
        media >= 7.0 -> {
            print("Aprovado")
        }
        else -> {
            print("Reprovado")
        }
    }
}