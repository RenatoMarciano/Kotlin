fun main() {

    /*
    Map (ou dicionario) - Através de um par de valores ele consegue armazenar os dados
    O map é construido através de chave e valor

    Pair<K, V>

    Map - Imutável
    MutableMap - Mutável
     */
/*
    val usuarios = mutableMapOf(
        36 to "Henrique",
        55 to "Steve",
        89 to "Ronaldo"
    )

    /*
    usuarios.forEach{
        println("${it.key} - ${it.value}")
    }

     */
    /*
    usuarios.forEach{
        usuarios.values
    }

     */

    /*
    usuarios.forEach{
        valores -> println("${valores.key} - ${valores.value}")
    }

     */

 */

    /*
    val usuarios = mutableMapOf<Int, String>()

    println("Digite um id pro usuário: ")
    val id = readln().toInt()

    println("Digite o nome do usuário: ")
    val usu = readln()

    usuarios.remove(158)
    usuarios[id] = usu

    println(usuarios)

     */

    val usuarios = mutableMapOf<Int, String>()

    println("Digite um id pro usuário: ")
    val id = readln().toInt()

    println("Digite o nome do usuário: ")
    val usu = readln()

    usuarios.remove(158)

}