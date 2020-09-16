fun main(){
    val lu = Atleta("Lu", 100, 90)
    val teo = Atleta("Teo", 70, 70)

    val provaFacil = Prova(50, 60)
    val provaMedia = Prova(70, 75)
    val provaDificil = Prova(100, 90)

    provaFacil.realizarProva(lu)
    provaMedia.realizarProva(lu)
    provaDificil.realizarProva(lu)

    provaFacil.realizarProva(teo)
    provaMedia.realizarProva(teo)
    provaDificil.realizarProva(teo)
}
