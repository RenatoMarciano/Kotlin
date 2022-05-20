fun main() {

    print("Digite o valor 1: ")
    val num1 = readln().toInt()

    print("Digite o valor 2: ")
    val num2 = readln().toInt()

    println("A soma entre $num1 + $num2 é ${soma01(num1, num2)}")
    println("A Multiplicação entre $num1 x $num2 é ${multiplicacao(num1, num2)}")
    println("A divisão entre $num1 / $num2 é ${divisao(num1, num2)}")
    println("A subtração entre $num1 - $num2 é ${subtracao(num1, num2)}")

}

fun multiplicacao(n1: Int, n2: Int): Int{
    val mul = n1 * n2;
    return mul;
}

fun soma01(n1: Int, n2: Int): Int{
    val numeros = n1 + n2;
    return numeros;
}

fun divisao(n1: Int, n2: Int): Int{
    val div = n1 / n2;
    return div;
}

fun subtracao(n1: Int, n2: Int): Int{
    val sub = n1 - n2;
    return sub;
}