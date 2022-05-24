fun main() {

    option()

}
val nome = mutableListOf<String>()

fun option(){

    var opcao: String = ""

    while(opcao != "S" && opcao != "s"){
        println(
            "Escolha a opção abaixo" +
                    "\n #Cadastrar produto# **Cad** ou **1**" +
                    "\n #Deletar Produto# **Del** ou **2**" +
                    "\n #Atualizar Produto# **Atu** ou **3**" +
                    "\n #SAIR# **Sair** ou **S**"+
                    "\n Digite:"
        )
        opcao = readln()
        if (opcao == "1") {
            println("Os produtos: ${Adicionar(opcao)}")
        }
    }

}

fun Adicionar(nm: String): String {

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
// fun Delete(dl: String): String{
// val nome01 = mutableListOf<String>(Adicionar(dl))
// //nome01.add(Adicionar(nome01.toString()))
// while (true){
//
// println("Digite o produto que você deseja deletar da lista: ")
// val prodDel = readln()
//
// //Contains - Verifica se um valor existe na lista
// if(nome01.contains(prodDel)){
// nome01.remove(prodDel)
// break
// }else{
// println("O nome $prodDel não existe na lista! ")
// }
// }
// return nome01.toString();
// }
//
// /*   when(opcao){
// "Cad", "1" -> println("Os produtos: ${Adicionar(opcao)}")
//
// //"Del", "2" -> println("Os produtos: $opcao")
// "Del", "2" -> while (true){
// println("Digite o produto que você deseja deletar da lista: ")
// val prodDel = readln()
//
// //Contains - Verifica se um valor existe na lista
// if(Adicionar(opcao).contains(prodDel)){
//
// nomes.remove(prodDel)
// break
// }else{
// println("O nome $prodDel não existe na lista! ")
// }
// }
//
// }
// */