package nivel01

/*4. Faça um programa que leia e valide as seguintes informações:
     Nome: maior que 3 caracteres;
     Idade: entre 0 e 150;
     Salário: maior que zero;
     Sexo: 'f' ou 'm';
     Estado Civil: 's', 'c', 'v', 'd';*/

fun main() {
    var nome: String
    var idade: Int
    var salario: Double
    var sexo: String
    var estadoCivil: String
    do {
        print("Informe um nome: ")
        nome = readLine()!!
    } while (nome.length < 4)
    do {
        print("Informe uma idade: ")
        idade = readLine()!!.toInt()
    } while (idade <=  0  || idade >=  150 )
    do {
        print("Informe um salário: ")
        salario = readLine()!!.toDouble()
    } while (salario <= 0.00)
    do {
        print("Informe um sexo biológico: ")
        sexo = readLine()!!.toLowerCase()
    } while (sexo != "f" && sexo != "m")
    do {
        print("Informe um estado cívil: ")
        estadoCivil = readLine()!!.toLowerCase()
    } while (estadoCivil != "s" && estadoCivil != "c" && estadoCivil != "v" && estadoCivil != "d")

    print("Nome: $nome\n" +
          "Idade: $idade\n" +
          "Salário: $salario\n" +
          "Sexo: $sexo\n" +
          "Estado cívil: $estadoCivil")
}