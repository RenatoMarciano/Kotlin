fun main() {

    /*
    Set - Faz o mesmo que o List, mas ignora valores duplicados

    set - Imutável
    MutableSet - mutável
     */

    val num = mutableSetOf(1, 2, 3, 3, 4, 2) //Número duplicado vai ser ignorado

    println(num.size)

    println(num)
}