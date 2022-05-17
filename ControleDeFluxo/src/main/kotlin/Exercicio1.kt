fun main(args: Array<String>) {

    /*
    Faça um programa que receba três inteiros e diga qual deles é o maior
     */
    /*
    print("Entre com o primeiro número: ")
    val num1 = readln().toInt()

    print("Entre com o segundo número: ")
    val num2 = readln().toInt()

    print("Entre com o terceiro número: ")
    val num3 = readln().toInt()

    if (num1 < num2 && num1 < num3) {

        println(num1)

    }else if (num2 < num1 && num2 < num3){

        println(num2)

    }else{

        print(num3)
    }

     */
    //Professor
    print("Entre com o primeiro número: ")
    val num1 = readln().toInt()

    print("Entre com o segundo número: ")
    val num2 = readln().toInt()

    print("Entre com o terceiro número: ")
    val num3 = readln().toInt()

    if(num1 > num2 && num1 > num3){
        println("O maior número digitado foi $num1")
    }else if(num2 > num1 && num2 > num3) {
        println("O maior número digitado foi $num2")
    }else{
        println("O maior número digitado foi $num3")
    }

}