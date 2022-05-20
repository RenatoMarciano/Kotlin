fun main(args: Array<String>) {

    /*

    Funçoes - Blocos de código que poderes chamar a qualquer momento dentro
    do nosso código.

    Funções com retorno- Eles servirão para retornarmos um valor que conseguiremos
    armazenar dentro de uma variável ou simplemesnte exibir através de, por exemplo,
    um println.

    Funções sem retorno - Elas servirão para a gente conseguir executar
    um bloco de código que vai exibir ou fazer mudanças específicas dentro
    do nosso código.

     */

    /*
    //Exemplo de uma função sem retorno - se
    println("abc")

    //Exemplo de uma função com retorno
    val nome = readln()

     */

    /*
    //Exemplo de código sem utilizar uma função


    var vida = 10

    //Inimigo nos deu 2 de dano
    vida -= 2

    if (vida <= 0){
        println("Você está morto!")
    }else if (vida in 1.. 3) {
        println("Você está morrendo...")
    }else if (vida in 4..7){
        println("Você está bem")
    }else if (vida in 8..9){
        println("Você está ótimo")
    }else{
        println("Sua vida está cheia!")
    }

     */

    /*
    Estrutura de uma função

    fun identificador (parametros){

        Bloco de código que será executado cada vez que a função for chamada

    }
     */

    //Exemplo utilizando uma função sem retorno
    /*
    var vida = 10


    //Inimigo nos deu 2 de dano
    vida -= 2
    estadoPersonagem(vida)

    //Exemplo chamando função
    estadoPersonagem(vida)

    //Exemplo chamando função
    estadoPersonagem(3)

    //Inimigo nos deu 3 de dano
    vida -= 3
    estadoPersonagem(vida)

    //Inimigo nos deu 4 de dano
    vida -= 4
    estadoPersonagem(vida)

    //Inimigo nos deu  3 de dano
    vida -= 3
    estadoPersonagem(vida)

    //Inimigo nos deu 8 de dano
    vida -= 8
    estadoPersonagem(vida)

    escrevaOi()
    escrevaOi()
    escrevaOi()
    escrevaOi()

     */

    /*

    // Chamando a função com retorno de diversas formas diferentes
    println("Digite o seu nome para ver ele em letras maiúsculas: ")
    val nome = readln()

    println("O se nome em letras maiúsculas ´2 ${caracteresMaiusculos(nome)}")

    // Chamando a função com retorno de diversas formas diferentes
    println("Digite o seu nome para ver ele em letras maiúsculas: ")
    val nome2 = caracteresMaiusculos(readln())

    println("O se nome em letras maiúsculas $nome")



     */
    // Chamando a função com retorno de diversas formas diferentes
    println("Digite o seu nome para ver ele em letras maiúsculas: ")
    val nome3 = readln()
    val maiusculo = caracteresMaiusculos(nome3)

    println("O se nome em letras maiúsculas $maiusculo")



}

//Parâmetros - Informações obrigatórias que precisaremos passar no momento em que formos.
//Chamar a nossa função.

fun estadoPersonagem(vida: Int){
    if (vida <= 0){
        println("Você está morto!")
    }else if (vida in 1.. 3) {
        println("Você está morrendo...")
    }else if (vida in 4..7){
        println("Você está bem")
    }else if (vida in 8..9){
        println("Você está ótimo")
    }else{
        println("Sua vida está cheia!")
    }
}

fun escrevaOi(){
    println("Oi")
}

//Função com retorno para retornar um conjunto de caracteres em letras maiúsculas

fun caracteresMaiusculos(valor: String): String{
    return valor.uppercase();
}