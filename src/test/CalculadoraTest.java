package test;

import static org.junit.Assert.assertEquals;

import main.Calculadora;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
    private Calculadora calculadora;

    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSum() {
        double result = calculadora.sum(2.0, 7.1);
        assertEquals("Suma de 2.0 y 7.1 debe ser 9.1", 9.1, result, 1e-3);
    }

    @Test
    public void testSubstrac() {
        double result = calculadora.substract(7.1, 2.0);
        assertEquals("Resta de 7.1 y 2.0 debe ser 5.1", 5.1, result, 1e-3);
    }

    @Test
    public void testMult() {
        double result = calculadora.multiply(2.0, 7.1);
        assertEquals("Multiplicación de 2.0 y 7.1 debe ser 14.2", 14.2, result, 1e-3);
    }

    @Test
    public void testDivide() {
        double result = calculadora.divide(7.1, 2.0);
        assertEquals("División de 7.1 y 2.0 debe ser 3.55", 3.55, result, 1e-3);
    }

    @Test
    public void testRaiz(){
        double result = calculadora.squareRoot(9.0);
        assertEquals("Raíz cuadrada de 9.0 debe ser 3.0", 3.0, result, 1e-3);
    }

    @Test
    public void testExponencial(){
        double result = calculadora.exponential(3.0);
        assertEquals("Exponencial de 3.0 debe ser 20.085", 20.085, result, 1e-3);
    }


}
