package heranca

class Cavalo
    (
    nome: String, idade: Int

) : Animal(nome, idade){

    private var procriar = "Acasalar"

    fun procedProcriar (){
        println("O cavalo está na época de $procriar")
    }

    override fun emitirSon() {
        super.emitirSon()
        println("O cavalo está 'hinn in in' ")
    }

    override fun correr() {
        super.correr()
        println("Cavalado está se exercitando, para o campeonato.")
    }
}