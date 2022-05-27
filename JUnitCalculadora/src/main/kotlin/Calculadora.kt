import kotlin.math.pow
import kotlin.math.sqrt

class Calculadora
    (
    var n1: Double, n2: Double
            ){


        fun soma(n1: Double, n2: Double): Double{
            return n1 + n2
    }

        fun subtracao(n1: Double, n2: Double): Double{
            return n1 - n2
        }

        fun multiplicacao(n1: Double, n2: Double): Double{
            return n1 * n2
    }

        fun divisao(n1: Double, n2: Double): Double{
            return n1 / n2
        }

        fun porcentagem(n1: Double, n2: Double): Double{
            val por = n1 * n2 / 100
            return por
        }

        fun potencia(n1: Double, n2: Double): Double{
            val pot = n1.pow(n2)
            return pot
        }

        fun raizQuadrada(num: Double): Double{
            return sqrt(num)
        }

        //Função  verificando os testes
        fun resulSoma():Double{
            return soma(10.0, 10.0)
        }
        fun resulSub():Double{
            return subtracao(10.0, 10.0)
        }
        fun resulMult():Double{
           return multiplicacao(10.0 ,10.0)
        }
        fun resulDiv():Double{
            return divisao(10.0 , 10.0)
        }
        fun resulPor():Double{
            return porcentagem(10.0 ,10.0)
        }
        fun resulPot():Double{
            return potencia(10.0,2.0)
        }
        fun resulRaiz():Double{
            return raizQuadrada(9.0)
        }
}