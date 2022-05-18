fun main (){

    /*

    Estrutura do for

    for (variavel range step){}

    for(i in 1..10){

        Código que vai loopar enquanto o nosso ranger não é finalizado

    }

    */

    // Exemplo prático do for
/*
    print("Digite um número para calcularmos sua tabuada: ")
    val num = readln().toDouble()

    for (i in 1..10){ // Vai de 1 até 10

        println("$num x $i = ${num * i}")
    }

 */
/*
    print("Digite um número para calcularmos sua tabuada: ")
    val num = readln().toDouble()

    for (i in 1..10 step 2){ // Step é para pular de dois em dois.

        println("$num x $i = ${num * i}")
    }

 */
/*
    print("Digite um número para calcularmos sua tabuada: ")
    val num = readln().toDouble()

    for (i in 10 downTo 1){ // downTo a Tabuada fica de trás para frente

        println("$num x $i = ${num * i}")
    }

 */
    print("Digite um número para calcularmos sua tabuada: ")
    val num = readln().toDouble()

    for (i in 10 downTo 1 step 2){ // downTo a Tabuada fica de trás para frente
                                        // com step indo em 2 em 2.

        println("$num x $i = ${num * i}")
    }
}