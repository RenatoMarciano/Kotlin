class Cliente (
        var nome : String = "",
        var idade : Int = 0,
        var altura : Double = 0.0 ,
        var peso : Double = 0.0
        )
{
        /*
        Crie uma classe cliente e apresente os atributos e métodos referentes
        esta classe, em seguida crie um objeto cliente, defina as instancias deste
        objeto e apresente as informações deste objeto no console.
         */

        var quantidadeProd : Int = 0

        fun qtdeProd() {
                if (quantidadeProd >= 10){
                        print("Limite de quantidade, para esse produto é 10.")
                }else{
                        print("Compra realizada com sucesso!")

                }
        }
}