import java.util.Scanner

fun main() {
    var peso: Float?
    var exc: Float=0.0f
    var soma: Float=0.0f
    var total: Float=0.0f

    println("Informa o peso: ")
    peso = readln()!!.toFloat()


    if (peso >= 50){
        soma = peso - 50
        exc = soma
        soma = soma * 4;
        total = soma + exc
        print("Peso do Tomate é R$ " + peso + ", excesso do peso é " + exc + ", A soma da multa é R$ " + soma +
                " total do produto final. R$ " + (total + 50))
    }else{
        soma = soma * 0
        exc = exc * 0
        print("Está tudo Zero, não pagará nenhum adicional. RS " + soma + ", O peso não exedeu, " + exc)
    }

}