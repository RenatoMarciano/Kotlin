import encapsulamento.Cliente

fun main(args: Array<String>) {

    while (true){

        print("Digite o seu nome: ")
        val nome = readln()

        try {

            val cliente = Cliente(nome)

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
                        println("DIGITE UM ITEM PARA ADICIONAR NO CARRINHO: ")
                        val compra = readln()
                        cliente.Adicionar(compra)
                    }

                    2 -> {
                        println("Digite um item para ser removido: ")
                        val compra = readln()
                        cliente.removeCompra(compra)
                    }

                    3 -> {
                        cliente.mostrarCompras()
                    }

                    4 -> break

                    else -> println("Valor Inválido.")
                }

            }
            break
        }catch (e: Exception){
            println(e.message)
        }

    }
}