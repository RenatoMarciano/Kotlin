data class Paciente (
    var nome: String,
    var idade: Int,
    var resulExame: String,
    var data: String,
    var valorConsulta: Double
                )
{

    /*
    Crie uma classe paciente e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto paciente, defina as instancias deste
    objeto e apresente as informações deste objeto no console.
     */
    var convenio = false;


    fun Conv() {
        if (convenio) {
            println("Convenio pagará sua consulta!")
        } else {
            println("Você pagará a consulta.")
        }
    }
}
