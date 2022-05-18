fun main() {

    /*

    Escrever um programa que receba vários números inteiros no teclado.
    E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).

     */

    /*
    var num: Int = 0
    do {
        print("Digite o número: ")
        num = readln().toInt()

    }while (num != 0)

     */

    var soma = 0
    var cont = 0

    do{

        print("Digite um número: ")
        val num = readln().toInt()

        cont++
        if(num % 3 == 0 && num != 0)
            soma += num

    }while (num != 0)

    val media = soma / cont

    println("A soma de todos os números múltiplos de 3 digitados é: $soma " +
            " e a média desses números é: $media")
}