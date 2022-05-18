fun main(){

    /*

    Estrutura do do..while

    do{

        Bloco de código que será executado pelo menos uma vez e se
        repetirá casp a condição seja verdadeira.

      }while(condicao)
    */

    var cont = 0

    do{

        println("Tem o Pete e o Repete, o Pete morreu, quem sobrou?: ")
        val nome = readln()

        cont++

    }while (nome == "Repete" && cont < 3)

}