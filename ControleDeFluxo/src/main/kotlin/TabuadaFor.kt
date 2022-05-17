fun main(args: Array<String>) {

    var tabuada = 1..10
    var sequencia = 1.. 10
    for (tab in tabuada){
        println("\nTabuada do $tab ")

        for (seq in sequencia) {
            var soma = seq * tab

            println("$seq x $tab = $soma")


        }
    }
}