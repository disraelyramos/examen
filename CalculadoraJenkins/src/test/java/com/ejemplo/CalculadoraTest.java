package com.ejemplo;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testDivision() {
        Calculadora calc = new Calculadora();
        double resultado = calc.dividir(10, 2);
        assertEquals(5.0, resultado, 0.01); // Esta prueba debe fallar
    }
}
