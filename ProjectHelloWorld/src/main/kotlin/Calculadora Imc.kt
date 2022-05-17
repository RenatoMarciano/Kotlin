import java.util.Scanner

fun main() {

    var peso = 70.5f
    var altura = 1.70f
    var imc : Float?

    imc =   peso /( altura * altura)

    if (imc < 18.5){
    println("magreza: " + imc)
    }
    else if (imc <= 24.9){
        println("Normal: " + imc)
    }else if (imc <= 29.9){
        println("Sobrepeso: " + imc)
    }else if(imc <= 34.9){
        println("Obesidade grau I: " + imc)
    }else if (imc <= 39.9){
        println("Obesidade grau II: " + imc)
    }else{
        println("Maior que 40: " + imc)
    }


}