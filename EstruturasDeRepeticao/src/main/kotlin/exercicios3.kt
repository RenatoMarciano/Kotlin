fun main() {

    /*

    Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
    Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)

     */

    /*
    var cont : Int = 0
    var cont2 : Int = 0
    var cont3 : Int = 0

    do {
        print("Digite o seu nome: ")
        var idade = readln().toInt()

        if (idade < 21 ){
    cont++
        }else if (idade > 50){
            cont2++
        }else{
            cont3++
        }
    }while (idade != -99)

    println("\nQuantidade de idade menor que 21 anos são: ${cont - 1} ")

    println("Quantidade de idade maior que 50 anos são: $cont2 ")

    println("Quantidade de idade fora do programa: $cont3 ")

     */
/*
    var cont: Int = 0
    var cont2: Int = 0
    var cont3: Int = 0
    var idade: Int = 0

    while (idade != -99){

    print("Digite o seu nome: ")
    idade = readln().toInt()

    if (idade < 21) {
        cont++
    } else if (idade > 50) {
        cont2++
    } else {
        cont3++
    }
}

    println("\nQuantidade de idade menor que 21 anos são: ${cont - 1} ")

    println("Quantidade de idade maior que 50 anos são: $cont2 ")

    println("Quantidade de idade fora do programa: $cont3 ")

 */
    // Professor

    var idade = 0
    var p21 = 0
    var p50 = 0

    while (idade != -99){

        print("Digite uma idade: ")
        idade = readln().toInt()

        if (idade != -99){
            if(idade < 21){
                p21++
            }else if(idade > 50){
                p50++
            }
        }
    }

    println("O número de pessoas menores de 21 anos de idade é $p21")
    println("O número de pessoas maiores de 50 anos de idade é $p50")
}