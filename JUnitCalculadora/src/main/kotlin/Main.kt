fun main(args: Array<String>) {


    while (true) {

        print("Digite o primeiro número: ")
        val num1 = readln().toDouble()

        print("Digite o segundo número: ")
        val num2 = readln().toDouble()

    var calculadora = Calculadora(num1, num2)

    println("Escolha a opção")
    println("Soma        '+'  ")
    println("SUbtrair    '-'  ")
    println("Multiplicar '*'  ")
    println("Dividir     '/'  ")
    println("Porcentagem '%'  ")
    println("Potência    '^'  ")


        try {
            val opcao = readln()

            when(opcao) {
                "+" -> {
                    println(calculadora.soma(num1, num2))
                }
                "-" -> {
                    println(calculadora.subtracao(num1, num2))
                }
                "*" -> {
                    println(calculadora.multiplicacao(num1, num2))
                }
                "/" -> {
                    println(calculadora.divisao(num1, num2))
                }
                "%" -> {
                    println(calculadora.porcentagem(num1, num2))
                }
                "^" ->{
                    println(calculadora.potencia(num1, num2))
                }
                "7" -> {
                    break
                }

                else -> println("Opeção Inválido!")
            }

        }catch (e: Exception){
            println("Digite uma opção valida.")
        }

    }
}