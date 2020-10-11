class JogadorDeFutebol(
    var nome: String,
    var energia: Int,
    var alegria: Int,
    var gol: Int,
    var experiencia: Int,
) {

    fun fazerGol() {
        energia -= 5
        alegria += 10
        gol += 1
        println("GOOOOL!")
    }

    fun correr() {
        energia -= 10
        println("Cansei")
    }

    override fun toString(): String {
        return "${nome} tem ${energia} de energia, ${alegria} de alegria e ${experiencia} de experiência"
    }
}