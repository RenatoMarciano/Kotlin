/*
fun main() {

/*
Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list
 */

    val produtos = mutableListOf<String>()

    while (true){
        println("Escolha uma opão: \n")
        println("1 - Adicionar Produtos")
        println("2 - Remover Produtos")
        println("3 - Atualizar Produtos")
        println("4 - Listar Produtos")
        println("5 - Sair\n")

        print("opcao: ")
        val opcao = readln().toInt()

        when(opcao) {

            1 -> {
                println("Digite o nome do produto: ")
                val prod = readln()

                if (prod != "") {
                    produtos.add(prod)
                    println("Produto cadastrado!\n")
                } else {
                    println("O nome do produto não pode se vazio")
                }
            }

            2 -> {
                println("Digite o produto a ser deletado: ")
                val prod = readln()

                if (produtos.contains(prod)) {
                    produtos.remove(prod)
                    println("Produto removido com sucesso!")
                } else {
                    println("Produto não existe na lista\n")
                }
            }

            3 -> {
                println("Lista de produtos")

                produtos.forEach {
                    println(it)
                }
                println("\nDigite uma produto a ser atualizado: ")
                val prod = readln()

                if (produtos.contains(prod)) {
                    val index = produtos.indexOf(prod)

                    println("Digite o novo produto: ")
                    val valor = readln()
                    produtos[index] = valor

                    println("Produto atualizado com sucesso!\n")
                } else {
                    println("Produto não existe na lista\n")
                }
            }

            4 -> {
            println("Lista de produtos")

                    produtos . forEach {
                println(it)
            }
                println()
        }

            5 -> break

            else -> println("Valor Inválido\n")

        }
    }
}

 */

fun main() {

/*
Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list
 */

    val produtos = mutableListOf<String>()

    while (true){
        println("Escolha uma opão: \n")
        println("1 - Adicionar Produtos")
        println("2 - Remover Produtos")
        println("3 - Atualizar Produtos")
        println("4 - Listar Produtos")
        println("5 - Sair\n")

        print("opcao: ")
        val opcao = readln().toInt()

        when(opcao) {

            1 -> {
                println("# # # Cadastro de produto # # #\n")
                do {

                println("Digite o nome do produto: ")
                val prod = readln()

                if (prod != "") {
                    produtos.add(prod)
                    println("Produto cadastrado!\n")
                } else {
                    println("O nome do produto não pode se vazio")
                }
            }while (prod != "")
        }

            2 -> {
                println("Digite o produto a ser deletado: ")
                val prod = readln()

                if (produtos.contains(prod)) {
                    produtos.remove(prod)
                    println("Produto removido com sucesso!")
                } else {
                    println("Produto não existe na lista\n")
                }
            }

            3 -> {
                println("Lista de produtos")

                produtos.forEach {
                    println(it)
                }
                println("\nDigite uma produto a ser atualizado: ")
                val prod = readln()

                if (produtos.contains(prod)) {
                    val index = produtos.indexOf(prod)

                    println("Digite o novo produto: ")
                    val valor = readln()
                    produtos[index] = valor

                    println("Produto atualizado com sucesso!\n")
                } else {
                    println("Produto não existe na lista\n")
                }
            }

            4 -> {
                println("Lista de produtos")

                produtos . forEach {
                    println(it)
                }
                println()
            }

            5 -> break

            else -> println("Valor Inválido\n")

        }
    }
}