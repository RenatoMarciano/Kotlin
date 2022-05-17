import kotlin.math.pow

fun main() {

    //Exercício
    /*
    Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a
    área e o perímetro dele.
    */

    print("Digite o diâmetro do círculo: ")
    val diametro = readln().toDouble()

    val raio = diametro / 2
    val pi = 3.14

    val area = pi * raio.pow( 2)
    val perimetro = 2 * pi * raio

    // Formatar número format(valor)
    // Padrão para formatar - "%.2f".format(valor)

    println("Com base no diâmetro $diametro, temos: ")
    println("Área = ${"%.2f".format(area)}")
    println("Perímetro = ${"%.2f".format(perimetro)}")

    /*

    Var - Valores que podem mudar (mutáveis).
    val - São valores constantes (imutáveis).
    */

}