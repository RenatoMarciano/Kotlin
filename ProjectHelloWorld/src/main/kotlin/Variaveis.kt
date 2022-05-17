import java.util.Scanner

fun main(args: Array<String>) {

    /*
     Variaveis e seus tipos

     var identificador: Tipo = Valor

     Int - que armazena valores inteiros (ex: 1, 2, 3...)
     Double - Armazena números reais (ex: 1.5, 6.7, 5.6...)
     Char - Armarzena apenas um caracter (ex: k, M, j...)
     String - Amarzena uma cadeia de caracteres (ex: Uma frase, um nome,
     lebrando que toda a cadeia de caracteres é representada por "")
     Boolean - Armazenar valores lógicos (True ou False)
    */

    /*
    Exemplos de declaração


    var num: Int = 9

    var num2: Double = 5.4

    //Type Inference - Adiciona o tipo da variável por meio do valor passando na declaração

    var nome = ""

     */
    /*
    Exemplo prático do uso das variáveis

    readline() - Scanner -- readLn()


    var nome = "Henrique"
    var idade = 21
    var altura = 1.75
    var comidaFavorita = "Temaki"

    // Concatenação usando + (Forma que funciona, mas não é a mais utilizada) ou
    // $ (forma que nós mais utilizaremos)

    println("Olá, meu nome é " + nome + " tenho" + idade + " anos de idade, tenho ainda" +
            altura + " de altura e minha comida favorita é " + comidaFavorita)

    println("Olá, meu nome é $nome tenho $idade anos de idade, tenho ainda" +
           " $altura de altura e minha comida favorita é $comidaFavorita")
    */

    /* Exemplo utilizando Scanner
    var leitura = Scanner(System.`in`)

    print("Digite seu nome: ")
    var nome = leitura.next()

    print("Digite sua idade: ")
    var idade = leitura.nextInt()

    print("Digite a sua altura: ")
    var altura = leitura.nextDouble()

    println("Olá, meu nome é $nome tenho $idade anos de idade e tenho ainda" +
            " $altura de altura.")

     */
    /*
    //Exemplo utilizando readLine() -> trás o tipo de variavel String? que dizer que aceita valor nulo
    // Para tirar o nulo da readline, tem que declarar assim readLine()!!
    // readln() -> Retorna o valor de String apenas sem ser nulo.

    print("Digite seu nome: ")
    var nome = readln()

    print("Digite sua idade: ")
    //Conversão de Tipos - toTipo()
    var idade = readln().toInt()

    print("Digite a sua altura: ")
    var altura = readln().toDouble()

    println("Olá, meu nome é $nome tenho $idade anos de idade e tenho ainda" +
            " $altura de altura."
    */
    /*

    Operadores Aritméticos

    Adição +
    Subtração -
    Multiplicação *
    Divisão /
    Módulo %

    */
/*
    //Exemplo utilizando cálculo

    print("Digite o nome do funcionário: ")
    var nome = readln()

    println("Digite o salário dele: ")
    print("R$ ")
    var sal = readln().toDouble()

    var bonus = sal * 0.2

    println("O salário do funcionário, com 20% de bonus é: R$ ${sal + bonus}")

    1 - Faça um programa em que o usuário digite o
        diâmetro de um círculo e calcule a área e o perímetro dele
 */
    var area: Double = 0.0
    val pi: Double = 3.14
    var peri: Double = 0.0
    var raio: Double
    var tipo: String = ""

    print("Digite o Diâmetro do círculo: ")
    var diame = readln().toDouble()

    /*
        print("Digite se é metros(MT) ou centimetros(CM)")
        tipo = readln()

        if (tipo == "cm" || tipo == "CM") {
            raio = diame / 2

            area = Math.pow(raio, 2.0) * pi

            peri = (pi + pi) * raio

            println("O diâmetro é $diame, a aréa é $area cm, e o perímetro é $peri cm")
        } else {
            println("O diâmetro é $diame, a aréa é $area metros, e o perímetro é $peri metros")
        }

     */
/*
    do {
        print("Digite se é metros(MT) ou centimetros(CM): ")
        tipo = readln()


        if (tipo != "cm" && tipo != "CM" && tipo != "MT" && tipo != "mt") {

            raio = diame / 2

            area = Math.pow(raio, 2.0) * pi

            peri = (pi + pi) * raio
        }

    }while (tipo != "cm" && tipo != "CM" && tipo != "MT" && tipo != "mt")

    println("O diâmetro é $diame, a aréa é $area cm, e o perímetro é $peri cm")

    // println("O diâmetro é $diame, a aréa é $area metros, e o perímetro é $peri metros")

 */

    do {
        print("Digite se é metros(MT) ou centimetros(CM): ")
        tipo = readln()


        if (tipo == "cm" || tipo == "CM" || tipo == "MT" || tipo == "mt") {

            raio = diame / 2

            area = Math.pow(raio, 2.0) * pi

            peri = (pi + pi) * raio
        }

    }while (tipo != "cm" && tipo != "CM" && tipo != "MT" && tipo != "mt")

    println("O diâmetro é $diame $tipo, a aréa é $area $tipo, e o perímetro é $peri $tipo")

}