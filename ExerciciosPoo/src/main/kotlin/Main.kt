import encapsulamento.Funcionario

fun main(args: Array<String>) {
    /*
  Cria uma Classe Funcionario, contendo os atributos encapsulados, um construtor padrão e pelo menos mais duas opções
  de construtores conforme sua percepção, com os atributos: nome (String), endereço (String), telefone (String),
  listaDeCompras (mutableListOf<Strings>()).

  A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
  Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
  Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.
   */

    while (true) {

        print("Digite o nome do funcionario: ")
        val func = readln()

        try {

            val funcionario = Funcionario(func)

        while (true){

            println("\n***Menu***\n")

            println(" 1 - Adicionar Compras")
            println(" 2 - Remover Compras")
            println(" 3 - Listar Compras")
            println(" 4 - Sair")

            print("Opção: ")
            val opcao = readln().toInt()

            when(opcao){

                1 -> {
                    println("Digite um item para adicionar no lista: ")
                    val addList = readln()
                    funcionario.AddFuncionario(addList)
                }

                2 -> {
                    println("Digite o item para ser removido: ")
                    val remov = readln()
                    funcionario.Remover(remov)

                }

                3 -> {
                    funcionario.ListarFunci()
                }

                4 -> break

                else -> println("Valor inválido.")
            }
        }
            break
        }catch (e: Exception){
            println(e.message)
        }
    }
}