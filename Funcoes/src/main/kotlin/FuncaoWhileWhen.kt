fun main() {

    var n01 : Double = 0.0
    var n02 : Double = 0.0
    var somaa : Double = 0.0


    print("Digite o primeiro número: ")
    n01 = readln().toDouble()

    print("Digite o segundo número: ")
    n02 = readln().toDouble()

    do {
    print("Digite uma operação: ")
    val opcao = readln()

    when (opcao){
        "+", "soma", "Soma", "SOMA" -> println("A Soma é : ${somaa(n01, n02)}")
        "/", "divisao", "Divisao", "DIVISAO" -> println("A divisão é : ${divisao(n01, n02)}")
        "-", "subtracao", "Subtracao", "SUBTRACAO" -> println("A Subtração é : ${subtracao(n01, n02)}")
        "*", "multiplicacao", "Multiplicacao", "MULTIPLICACAO" -> println("A Multiplicacao é : ${multiplicacao(n01, n02)}")
        else -> println("Operador incorreto. ")

    }
        }while (opcao != "+" && opcao != "/" && opcao != "-" && opcao != "*")


}


fun somaa(a: Double, b:Double): Double {
    val soma = a + b
    return soma
}

fun divisao(a: Double, b:Double): Double {
    val div = a / b
    return div
}

fun subtracao(a: Double, b:Double): Double {
    val sub = a - b
    return sub
}

fun multiplicacao(a: Double, b:Double): Double {
    return a * b

}
