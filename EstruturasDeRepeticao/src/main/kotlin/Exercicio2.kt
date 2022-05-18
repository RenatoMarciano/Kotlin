fun main(){

    /*
    Ler 10 números e imprimir quantos são pares e quantos são ímpares.
     */
    var par: Int=0
    var impar: Int=0

    for (i in 10..19){

        if (i % 2 ==0 ){
            par ++
            println("Esse número é par. $i")

        }else{
            impar++
            println("Esse número é ímpar. $i")
        }
    }

    println("\nTotal de par é : $par")
    println("Total de impar é : $impar")
}