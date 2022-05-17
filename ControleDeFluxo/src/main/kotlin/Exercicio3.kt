fun main(args: Array<String>) {

    /*
    Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:

        10-14 infantil
        15-17 juvenil
        18-25 adulto


     */

    /*
    print("Digite a sua idade: ")
    val idade = readln().toInt()

    when(idade) {
        in 10..14 -> println("Infantil: $idade")
        in 15..17 -> println("Juvenil: $idade")
        in 18..25 -> println("Adulto: $idade")
        else -> print("Idade $idade, está fora.")
    }

     */

    //Professor

    print("Digite a idade para verificarmos em qual categoria você se encontra: ")
    val idade = readln().toInt()

    if (idade >= 10 && idade <= 14){
        println("Infantil: $idade")
    }else if(idade >= 15 && idade <= 17){
        println("Juvenil: $idade")
    }else if (idade >= 18 && idade <= 25){
        println("Adulto: $idade")
    }else {
        println("Você não se encontra em nenhuma categoria")
    }
}
