fun main(args: Array<String>) {

    /*

    Operadores Relacionais:

    == - Igualdade entre valores
    != - Diferença
    > - Maior
    < - Menor
    >= - Maior ou igual
    <= - Menor ou igual

    Operadores Lógicos

    e   ou

    &&  ||

    Tabela Verdade

    &&
    VV - Verdadeiro
    FV - Falso
    VF - Falso
    FF - Falso

    ||
    VV - Verdadeiro
    FV - Verdadeiro
    VF - Verdadeiro
    FF - Falso

    if...else

    if(condicao){

        Bloco que será executado, caso a condição seja verdadeira.

    }else{

        Bloco que será executado, caso a condição seja falsa.

    }

    */

    //Exemplo prático usando IF
    /*
    println("O seu nome é Henrique? ")
    print("Resposta: ")
    val resp = readln()

    if(resp == "sim" || resp == "sim"){

        println("Beleza mano, vlw")
    }else{

        println("Ah, ok")
    }

    */

    //Exemplo fazendo uma simulação de criação de senha

    /*
    print("Crie a sua senha: ")
    val senha = readln()

    println("Quantidade de caracters digitado. "  + senha.length)

    if(senha.length < 8){

        println("Senha inválida")

    }else{

        println("Senha criada com sucesso!")
    }

     */

    /*

    Compras menores do que 50 - 0%
    Compras entre 50 e 100 - 10%
    Compras entre 101 e 200 - 20%
    Compras acima de 200 - 30%

    Mostrar o valor da compra do usuário já com o desconto aplicado.

     */

    /*
    println("Informe o valo da compra: ")
    print("R$: ")
    val compra = readln().toDouble()

    var desc = 0.0

    if (compra < 50){

        desc = 0.0

    }else if (compra >= 50 && compra <= 100){

        desc = 0.1

    }else if (compra >= 101 && compra <= 200){

        desc = 0.2

    }else{

        desc = 0.3

    }
        val compraDesc = compra * desc

    println("A sua compra, com ${desc * 100}% de desconto, fica em torno de" +
    " R$ ${compra - compraDesc}")

     */

    println("Informe o valo da compra: ")
    print("R$: ")
    val compra = readln().toDouble()

    var desc = 0.0

    /*

    Ranges no Kotlin

    1..10 - Intervalos de 1 até 10
     */

    if (compra < 50){

        desc = 0.0

    }else if (compra in 50.0..101.0){

        desc = 0.1

    }else if (compra in 101.0..200.0){

        desc = 0.2

    }else{

        desc = 0.3

    }
    val compraDesc = compra * desc

    println("A sua compra, com ${desc * 100}% de desconto, fica em torno de" +
            " R$ ${compra - compraDesc}")
}