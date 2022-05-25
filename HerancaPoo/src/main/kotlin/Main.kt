import heranca.Cachorro
import heranca.Cavalo
import heranca.Preguica

fun main(args: Array<String>) {
    /*
    Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela),
    utilize os seus conhecimentos e distribua as características de forma que tudo o que for comum a todos os animais
    fique na classe Animal:

                             Animal

    Cachorro                Cavalo                  Preguica
    Possui nome         Possui nome             Possui nome
    Possui idade        Possui idade            Possui idade
    Deve emitir som     Deve emitir som         Deve emitir som
    Deve correr         Deve correr             Deve subir em árvores

    Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e invoque o método que
    emite o som de cada um de forma polimórfica, isto é, independente do tipo de animal.
     */

    var cachorro = Cachorro(nome = "Papa", idade = 20)
    var preguica = Preguica(nome = "Sprid", idade = 43)
    var cavalo = Cavalo("Sory", 11)

    cachorro.emitirSon()
    cavalo.emitirSon()
    preguica.emitirSon()
println("\n")
    cachorro.correr()
    cavalo.correr()
    preguica.correr()



}