package heranca

open class Animal (var nome: String, var idade: Int){

open fun emitirSon(){
    println("Balhuro")
}

open fun correr(){
        println("Correndo")
    }
}