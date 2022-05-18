fun main(){

    /*

    Crie um programa que leia um número do teclado até que encontre um número igual a zero.
    No final, mostre a soma dos números digitados.

     */

    var cont: Double = 0.0

    do {

        print("Digite um número: ")
        var num = readln().toInt()

        cont = cont + num

    }while (num != 0)

    println("Soma dos números digitados é: $cont")
}