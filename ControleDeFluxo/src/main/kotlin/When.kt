fun main(args: Array<String>) {

    /*

    when - Quando um valor for tal a gente uma ação

    when(variavel){

        Estrutura dos códigos que serão executados a partir do momento que o
        variável se encontrar em um valor específico.

        }
    */

    // Exemplo prático do uso do When
    /*
    print("Digite um valor entre 1 e 12 para descobrir o mês: ")
    val mes = readln().toInt()

    when(mes){

        1 -> println("Janeiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Junho")
        7 -> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Dezembro")
        else -> println("Valor inválido")
    }

     */

    // Exemplo prático utilizando o ranger no when

    /*
    print("Digite um valor entre 1 e 12 para descobrir o mês é frio: ")
    val mes = readln().toInt()

    when(mes){

        in 1 ..3 -> println("Mês quente")
        in 4..6 -> println("Mês mais ou menos...")
        in 7..9 -> println("Mês frio")
        in 10..12 -> println("Mês dahora")
        else -> println("Mês inválido")
    }

     */

    //Exemplo colocando bloco de codigo dentro do when.

    print("Digite um valor entre 1 e 12 para descobrir o mês é frio: ")
    val mes = readln().toInt()

    when(mes){

        in 1 ..3 -> {
            println("Mês quente")
            println("Melhores meses de todos! ")
        }

        in 4..6 -> println("Mês mais ou menos...")
        in 7..9 -> println("Mês frio")
        in 10..12 -> println("Mês dahora")
        else -> println("Mês inválido")
    }
}