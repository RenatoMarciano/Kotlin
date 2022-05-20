fun main() {

    println("Digite o primeiro valor")
    val num1 = readln().toInt()

    println("Digite o segundo valor")
    val num2 = readln().toInt()

    soma1 (num1, num2)
}

fun soma1(n1: Int, n2: Int){
    println("A soma entre $n1 e $n2 é: ${n1 + n2}")
}