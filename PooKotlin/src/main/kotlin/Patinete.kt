class Patinete {

    /*
    Crie uma classe patinete e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto patinete, defina as instancias deste
    objeto e apresente as informações deste objeto no console.
     */

    var marca = "";
    var cor ="";
    var quantidade = 0;
    var modelo = "";
    var velocidade = 0;
    fun Pat(){
        if(velocidade >= 40 ){
            print("Velocidade Maxima! Reduza que a pista é 20 velocidade $velocidade")
        }else if (velocidade >= 20){
            print("Velocidade conforme permissão da via $velocidade.")
            }else if (velocidade >= 10) {
                print("Velocidade media.")
        }else {
            print("Começando a andar.")
        }

        }

}