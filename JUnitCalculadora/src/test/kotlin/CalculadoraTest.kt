import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {

    val calculadoraTest = Calculadora(n1 = 0.0, n2 = 0.0)


    @Test
    fun somaTest() {
        assertEquals( 20.0, calculadoraTest.resulSoma() )
    }

    @Test
    fun subtracaoTest() {
        /*TODO("Faça a subtrair.")*/
        assertEquals(0.0, calculadoraTest.resulSub())
    }

    @Test
    fun multiplicacaoTest() {
        /*TODO("Faça a multiplicação.")*/
        assertEquals(100.0, calculadoraTest.resulMult())
    }

    @Test
    fun divisaoTest() {
        /*TODO("Faça a divisão.")*/
        assertEquals(1.0, calculadoraTest.resulDiv())
    }

    @Test
    fun porcentagemTest() {
        /*TODO("Faça a Porcentagem.")*/
        assertEquals(1.0, calculadoraTest.resulPor())
    }

    @Test
    fun potenciaTest() {
        /*TODO("Faça a Potência.")*/
        assertEquals(100.0, calculadoraTest.resulPot())
    }

    @Test
    fun raizQuadradaTest(){
        assertEquals(3.0, calculadoraTest.resulRaiz())
    }
}