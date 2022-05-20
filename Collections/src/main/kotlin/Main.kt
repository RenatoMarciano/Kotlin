fun main(args: Array<String>) {

    //Exemplo utilizando o array

    val num = arrayOf(5, 6, 7, 2, 8)

    println(num[1]) //Mostrando a primeira posição da array

    num[2] = 58 //Alterando o valor array na posição 2

/*
    //For da forma simples para iterar sobre os valores do Array
    for (i in 0..4){
        println(num[i])
    }

 */

/*
    //Interar sobre os valores do array utilizando o for each
    for (i in num){
        println(i)
    }

 */

    /*
    //Interar sobre os valores do array utilizando o forEach - Lambida
    num.forEach {
        println(it)
    }

     */


    val nomes = arrayOfNulls<String>(3)


    nomes[0] = "Henrique"
    nomes[1] = "Geovanna"
    nomes[2] = "Paulo"





}
