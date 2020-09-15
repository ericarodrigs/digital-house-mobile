class Cachorro(var nome: String, var sobrenome: String) {
    //    var nome: String = ""
    var cor: String = ""
    var idade: Int = 0
    var anoNascimento: Int = 0
    var peso: Double = 0.0
    var nomeCompleto: String

    init {
        nomeCompleto = nome + sobrenome
    }

    init {
        idade = 2020 - anoNascimento
    }

    constructor(nome: String, peso: Double) : this(nome, "") {

    }

    constructor(nomeDoCachorro: String, anoNascimento: Int) : this(nomeDoCachorro, "") {
        this.anoNascimento = anoNascimento
    }


    fun calculaIdade(anoNascimento: Int): Int {
        return 2020 - anoNascimento
    }

    override fun toString(): String {
        return super.toString()
    }
}