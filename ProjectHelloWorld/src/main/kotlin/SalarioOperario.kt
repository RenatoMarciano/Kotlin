import java.util.Scanner

fun main() {

    var codigo:Int?
    var horas:Double?
    var total:Double?

    val reader = Scanner(System.`in`)

    print("Entrar com o Codigo: ")
    codigo = reader.nextInt()

    print("Entrar com as horas trabalhadas :")
    horas = reader.nextDouble()

    total = horas * 10

    if (horas >= 50) {

        println("Total de horas: " + total)
    }
}