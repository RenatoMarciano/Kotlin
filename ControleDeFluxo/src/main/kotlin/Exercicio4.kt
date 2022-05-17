import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {

    /*
    Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
    Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
     */
/*
    print("Digite o número: ") // Entrada de dados
    val num = readln().toInt() //Informando que ira imputar os dados e declarando a varíavel
    var soma: Double // Declarando a varíavel.


    if (num %2==0){ //Condição
        soma = sqrt(num.toDouble()) // Atribuindo a soma num na varíavel soma com a raiz quadrada.
        print("Esse número $num é par! E a raiz quadrada é $soma") // Para printar na tela


    }else{ // Se não for verdadeira a condição acima

        soma = num.toDouble().pow(2) // Atribuir a variavel soma o num elevado a 2
        print("Esse número $num é impar! Elevado ao quadrado é $soma") // Para aparecer a mensagem na tela.

    }

 */
    //professor
    print("Digite o valor 1: ")
    val num = readln().toDouble()

    if(num % 2 == 0.0){

        println("O número $num é par e sua raiz quadrada é: ${
            "%.2f".format(sqrt(num))
        }")
    }else{
        println("O número $num é ímpar e ele elevado ao quadrado é " +
        "%.2f".format(num.pow(2)))
    }

}