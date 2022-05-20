fun main() {

    /*
    //As principais collections do Kotlin é: Array, List, Set e Map - Eles podem ser alterados

    List - Listagem de valores, tendo um tamanho variável

    List - Lista Imutável - não pode mudar os valores internos e nem alterar o tamnho
    MutableList - Lista mutável - podemos alterar os valores e o seu tamanho
    */

    /*
    //Lista imutável
    val nomes = listOf("Henrique", "Rodrigo")

      //  println(nomes) //Funciona e trás as informação dentro da lista

    nomes.forEach{ // Trás as informação dentro da lista
        println(it)
    }

     */

    /*
    //Lista mutável
    val nomes = mutableListOf<String>()

    nomes.add("Paulo")
    nomes.add("Rodrigo")
    nomes.add("Rogério")

    println(nomes)

    nomes.add("Varvária")

    println(nomes)

     */

    //Exemplo prático utilizando o List

    val nomes = mutableListOf<String>()

    while (true) {
        println("Digite alguns nomes para adicionar na lista: ")
        val valor = readln()

        if (valor != "") {
            nomes.add(valor)
        } else {
            break
        }
    }
    println("O tamanho da lista é: ${nomes.size}") //Ver a quantidade que tem a lista
    println(nomes)

    //remove - Exclui item da lista
    /*
    println("Digite um nome para você deletar da lista: ")
    val valor = readln()

    nomes.remove(valor)

    println(nomes)

     */

    while (true){
        println("Digite um nome para você deletar da lista: ")
        val valor = readln()

        //Contains - Verifica se um valor existe na lista
        if (nomes.contains(valor)) {
            nomes.remove(valor)
            break
        } else {
            println("O nome $valor não existe na lista")
        }
    }

    println("O tamanho da lista é: ${nomes.size}") //Ver a quantidade que tem a lista
    println(nomes)

    //indexOf - Mostra a posição do item com base em seu valor
    println("Digite agora um valor que você queira editar: ")
    val edit = readln()

    if(nomes.contains(edit)){
        val index = nomes.indexOf(edit)
        println("Digite o novo nome: ")
        val valor= readln()
        nomes[index] = valor
        println("O nome foi atualizado com sucesso!")
    }else{
        println("O nome $edit não existe na lista")
    }

    println("O tamanho da lista é: ${nomes.size}") //Ver a quantidade que tem a lista
    println(nomes)
}