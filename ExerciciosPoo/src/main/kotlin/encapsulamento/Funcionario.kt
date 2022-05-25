package encapsulamento

class Funcionario (private var nome: String ){

    private var cargo = ""
    private var telefone = ""
    private var listaFunci = mutableListOf<String>()

    fun AddFuncionario(nome: String){
        if (nome != ""){
            listaFunci.add(nome)
            println("Lista adicionada com sucesso!")
        }else{
            println("Campo em branco.")
        }
    }
    fun Remover(valor: String){
        if(listaFunci.contains(valor)) {
            listaFunci.remove(valor)
            println("\nItem removido!")
        }else{
            println("\nO item não existe na lista!")
        }
    }
    fun ListarFunci(){
        println("\n***Lista de Funcionario***")
        listaFunci.forEach{
            println(it)
        }
            println()

    }
}