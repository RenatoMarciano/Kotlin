fun main(args: Array<String>) {

/*

Estruturas de Repetição

While → Executa se uma condição verdadeira
Do While → Executa sempre uma vez antes de verificar se a condição é verdadeira
For → Utiliza uma variável auxiliar (contador)

while - Equivalente ao enquanto
do..white - Equivalente ao faca..enquanto
for - Equivalente ao para

Estrutura do While

while(condição){

Código que vai se repetir enquanto a condição for verdadeira

}
*/
/*
        var soma = 0.0
        var num = 1.0
        var loop = false

        while(num != 0.0){

            // ! - Negação

            if(!loop){
                num == 0.0
                loop == true
            }


            print("Digite um número diferente de 0: ")
            num = readln().toDouble()
            soma += num

        }

        println("A soma de todos os números digitados é: $soma")

 */
/*
    var soma = 0.0
    var num = 1.0


    while(num != 0.0){

        num == 0.0

        print("Digite um número diferente de 0: ")
        num = readln().toDouble()
        soma += num

    }

    println("A soma de todos os números digitados é: $soma")
*/

    var soma = 0.0
    var num = 1.0

    while(num != 0.0){

        print("Digite um número diferente de 0: ")
        num = readln().toDouble()
        soma += num

    }

    println("A soma de todos os números digitados é: $soma")
}