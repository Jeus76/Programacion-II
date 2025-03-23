package com.prograII;

import static org.junit.jupiter.api.Assertions.*; // Importa JUnit 5 correctamente
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void testExpTaylor() {
        // Comprobamos que la función devuelve valores cercanos a Math.exp(x)
        assertEquals(Math.exp(1), App.expTaylor(1, 10), 0.0001);
        assertEquals(Math.exp(0), App.expTaylor(0, 10), 0.0001);
        assertEquals(Math.exp(-1), App.expTaylor(-1, 10), 0.0001);
        assertEquals(Math.exp(2), App.expTaylor(2, 10), 0.0001);
    }
}