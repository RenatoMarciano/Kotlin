package heranca

class Cachorro (
    nome: String, idade: Int

        ) : Animal(nome, idade) {

    private var alimentacao = "Ração para cachorro";

    fun comidaIdeal(){
        println("A alimentação ideal para o cachorro é $alimentacao")
    }

    override fun emitirSon() {
        super.emitirSon()
        println("Cachorro latindo...")
    }

    override fun correr() {
        super.correr()
        println("Cachorro correndo atrás do próprio rabo.")
    }
}