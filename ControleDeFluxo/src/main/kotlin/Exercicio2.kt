fun main(args: Array<String>) {

    /*
    Faça um programa que entre com três números e coloque em ordem crescente.
     */
/*
    print("Entre com o primeiro número: ")
    val num1 = readln().toInt()

    print("Entre com o segundo número: ")
    val num2 = readln().toInt()

    print("Entre com o terceiro número: ")
    val num3 = readln().toInt()

    if (num1 < num2 && num1 < num3 && num2 > num1 && num2 < num3){

        println(num1)
        println(num2)
        print(num3)
    }else if (num2 < num1 && num2 < num3 && num1 > num2 && num1 < num3){

        println(num2)
        println(num1)
        print(num3)
    }else if (num3 < num1 && num3 < num2 && num2 < num1){

        println(num3)
        println(num2)
        print(num1)
    }else{

        println(num3)
        println(num1)
        print(num2)
    }
*/
    /*
    print("Digite o primeiro numero? ")
    val n1 = readln().toInt()
    print("Digite o primeiro numero? ")
    val n2 = readln().toInt()
    print("Digite o primeiro numero? ")
    val n3 = readln().toInt()

    val order = listOf(n1,n2, n3 )

    print("Ordem: ${order.sorted()}")

     */
    //Professor
    print("Digite o primeiro numero?: ")
    val n1 = readln().toInt()

    print("Digite o primeiro numero?: ")
    val n2 = readln().toInt()

    print("Digite o primeiro numero?: ")
    val n3 = readln().toInt()

    //Sequencia de n1, n2, n3

    if(n1 <= n2 && n2 <= n3){
        println("$n1 - $n2 - $n3")
    }else if(n1 <= n3 && n3 <= n2){
        println("$n1 - $n3 - $n2")
    }else if(n2 <= n1 && n1 <= n3){
        println("$n2 - $n1 - $n3")
    }else if(n2 <= n3 && n3 <= n1){
        println("$n2 - $n3 - $n1")
    }else if(n3 <= n1 && n1 <= n2) {
        println("$n3 - $n1 - $n2")
    }else{
        println("$n3 - $n2 - $n1")
    }
}