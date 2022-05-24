
fun main() {
/*
    /*
    Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:

    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list
     */

/*
    println(
        "Escolha a opção abaixo" +
                "\n #Cadastrar produto# **Cad** ou **1**" +
                "\n #Deletar Produto# **Del** ou **2**" +
                "\n #Atualizar Produto# **Atu** ou **3**" +
                "\n #SAIR# **Sair** ou **S**"
    )

    val opcao = readln()

 */

    val nomes = mutableListOf<String>()

    var opcao: String = ""

    while (true) {
        if (opcao == "") {
            println(
                "             Escolha a opção abaixo" +
                        "\n ***********************************************" +
                        "\n * #Cadastrar produto# **Cad** ou **1**        * " +
                        "\n * #Deletar Produto# **Del** ou **2**          * " +
                        "\n * #Atualizar Produto# **Atu** ou **3**        * " +
                        "\n * #SAIR# **Sair** ou **S**                    * " +
                        "\n *********************************************** "
            )
            print(":")

            opcao = readln()


            if (opcao == "1") {
                println("Os produtos: ${Adicionar(opcao)}")
            }
            if (opcao == "2") {
                println("Os produtos Deletado é: ${Delete(opcao)}")
            }
        }

    }

}



fun Adicionar(nm: String): String {
    val nome = mutableListOf<String>()

    while (true) {
            print("Digite o nome do produto: ")
            val produto = readln()

            if (produto != "") {
                nome.add(produto)

            } else {
                break
            }
        }

    return nome.toString()
}

fun Delete(dl: String): String{
    val nome01 = mutableListOf<String>(Adicionar(dl))
    //nome01.add(Adicionar(nome01.toString()))
    while (true){

        println("Digite o produto que você deseja deletar da lista: ")
        val prodDel = readln()

        //Contains - Verifica se um valor existe na lista
        if(nome01.contains(prodDel)){
            nome01.remove(prodDel)
            break
        }else{
            println("O nome $prodDel não existe na lista! ")
        }
    }
    return nome01.toString();
}

/*   when(opcao){
    "Cad", "1" -> println("Os produtos: ${Adicionar(opcao)}")

    //"Del", "2" -> println("Os produtos: $opcao")
    "Del", "2" -> while (true){
        println("Digite o produto que você deseja deletar da lista: ")
        val prodDel = readln()

        //Contains - Verifica se um valor existe na lista
        if(Adicionar(opcao).contains(prodDel)){

            nomes.remove(prodDel)
            break
        }else{
            println("O nome $prodDel não existe na lista! ")
        }
    }

}
*/

 */
}