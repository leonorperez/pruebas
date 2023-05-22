package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    Calculadora cal = new Calculadora();

    @Test
    public void testSuma() {
        assertEquals(9, cal.sumar(6, 3));
    }

    @Test
    public void testResta() {
    assertEquals(10,cal.restar(20,10));
    }
    @Test
    public void testMultiplicacion(){
        assertEquals(20, cal.multiplicar( 5,4));
    }
    @Test
    public void testDividir(){
        assertEquals(20, cal.dividir(60,3));
    }

}