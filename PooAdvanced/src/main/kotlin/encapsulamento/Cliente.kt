package encapsulamento

class Cliente ( private var nome: String){
      private var endereco = ""
      private var telefone = ""


    private var listaDeCompras = mutableListOf<String>()

    init {
        if (nome == ""){
            throw Exception("A classe foi instanciada da maneira incorreta!")
        }
    }

    //Construtores
    constructor(nome: String, endereco: String) : this(nome) {
        this.endereco = endereco
    }

    constructor(nome: String, endereco: String, telefone: String)
            : this(nome, endereco) {
        this.telefone = telefone
    }

    fun Adicionar(compra: String) {
        if (compra != "") {
            listaDeCompras.add(compra)
            println("Cadastrado.")
        } else {
            println("/nO item não pode ser vazio!")
        }
    }

        fun removeCompra(compra: String){
            if(listaDeCompras.contains(compra)){
                listaDeCompras.remove(compra)
            println("\nItem removido!")
            }else{
                println("\nO item não existe na lista!")
            }
        }


    fun mostrarCompras() {
        println("\n***Lista de compras***\n")
        listaDeCompras.forEach {
            println(it)
        }
        println()
    }
}

/*
    A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
    Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
    Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.
 */