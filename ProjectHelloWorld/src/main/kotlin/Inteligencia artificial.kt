import java.util.Scanner

fun main() {
// Tem as 2 forma de fazer.
    var nome : String?
    var idade : Int?

    val reader = Scanner(System.`in`)

    print("Entrar com o seu nome: ")
    nome = reader.next()
    print("Entrar com a sua idade: ")
    idade = reader.nextInt()
    println("O nome é " + nome + " e a minha idade é " + idade)

/*
    println("Entrar com o seu nome: ")
    val nome : String = readLine()!!.toString()
    println("Entrar com a sua idade")
    var idade : Int? = readLine()!!.toInt()
    println("O nome é " + nome + " e a idade é " + idade)
    */
}
