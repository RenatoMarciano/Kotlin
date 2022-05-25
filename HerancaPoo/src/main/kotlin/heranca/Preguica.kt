package heranca

class Preguica
    (
    nome: String, idade: Int

): Animal(nome, idade) {

    private var ajuda = "Semar a terra"

    fun ajudaambiente(){
        println("função da Preguiça é $ajuda")
    }

    override fun emitirSon() {
        super.emitirSon()
        println("Esse son é de uma Preguiça, 'a A a A'")
    }

    override fun correr (){
        println("Subindo em árvore ")
    }


}