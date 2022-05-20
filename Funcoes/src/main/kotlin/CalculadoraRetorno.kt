import kotlin.math.pow

fun main() {
/*
    println("Digite o primeiro valor")
    val num1 = readln().toInt()

    println("Digite o segundo valor")
    val num2 = readln().toInt()

    println("A soma entre $num1 e $num2 é: ${soma2(num1, num2)}")

 */
    println("Digite o primeiro valor")
    val num3 = readln().toDouble()

    println("Digite o segundo valor")
    val num4 = readln().toDouble()

    println("A resultado da potência entre $num3 e $num4 é: ${pot(num3, num4)}")
}

fun soma2(n3: Int, n4: Int): Int{
    return n3 + n4
}

fun pot(valor: Double, exp: Double): Double{
    return valor.pow(exp)
}