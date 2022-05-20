fun main() {

    /*
    Fizzbuzz é um jogo infantil com as regras:

Você se reveza para contar de 1 até .. infinito. Mas digamos 100.
Sempre que o número for
um múltiplo de 3, você deve dizer "Fizz" em vez do número
um múltiplo de 5, você deve dizer "Buzz" em vez do número
um múltiplo de 3 E 5, você deve dizer "Fizzbuzz" em vez do número
Seu código deve imprimir os números de 1 a 100, mas com Fizz, Buzz e Fizzbuzz nos lugares certos.
     */

    var cont = 0
    for(i in 1..100){
/*

        cont++
        if (cont % 3 != 0 && cont % 5 != 0) {
            println(cont)
        }
        if (i % 3 == 0 && i % 5 == 0){
            println("FizzBuzz")
        }else if (i % 3 == 0 ){
            println("Fizz")
        }else if (i % 5 == 0){
            println("Buzz")
        }
        */
        cont++

        println("")

    }
}

fun Escolha(cont: Int, i: Int){


    if (cont % 3 != 0 && cont % 5 != 0) {
        println(cont)
    }
    if (i % 3 == 0 && i % 5 == 0){
        println("FizzBuzz")
    }else if (i % 3 == 0 ){
        println("Fizz")
    }else if (i % 5 == 0){
        println("Buzz")
    }
}
