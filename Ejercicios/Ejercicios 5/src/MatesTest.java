import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class MatesTest {

    @org.junit.jupiter.api.Test
    void sumatorioN() {
        //caso cuando n<0
        assertEquals(0, Mates.sumatorioN(-6));
        //caso cuando n=7
        assertNotEquals(0, Mates.sumatorioN(7));
    }

    @org.junit.jupiter.api.Test
    void factorialN() {
        //caso cuando n<1
        assertEquals(1, Mates.factorialN(-4));
        //caso cuando n=7
        assertNotEquals(1, Mates.factorialN(7));
    }

    @org.junit.jupiter.api.Test
    void potenciaN() {
        assertEquals(1, Mates.potenciaN(2, 0));
        assertNotEquals(1, Mates.potenciaN(2, 6));
    }

    @org.junit.jupiter.api.Test
    void sumaLista() {
        int[] listaVacia = {};
        assertEquals(0, Mates.sumaLista(listaVacia, 0));

        // Caso con lista de un solo elemento (debe devolver el valor del elemento)
        int[] listaUnElemento = {5};
        assertEquals(5, Mates.sumaLista(listaUnElemento, 0));

        // Caso con lista de números positivos
        int[] listaPositivos = {1, 2, 3, 4, 7};
        assertEquals(17, Mates.sumaLista(listaPositivos, 0));

        // Caso con lista que incluye números negativos
        int[] listaMixta = {-1, 2, -3, 4, -7};
        assertEquals(-5, Mates.sumaLista(listaMixta, 0));

    }

    @org.junit.jupiter.api.Test
    void mediaListaRecursiva() {
        int[] listaVacia = {};
        assertTrue(Double.isNaN(Mates.mediaLista(listaVacia)));  // NaN para lista vacía

        // Caso con lista de un solo elemento (debe devolver el valor del elemento)
        int[] listaUnElemento = {10};
        assertEquals(10.0, Mates.mediaLista(listaUnElemento), 0.0001);  // Media de 10 es 10

        // Caso con lista de números positivos
        int[] listaPositivos = {1, 2, 3, 4, 5};
        assertEquals(3.0, Mates.mediaLista(listaPositivos), 0.0001);  // Media de 1, 2, 3, 4, 5 es 3

        // Caso con lista con números negativos
        int[] listaMixta = {-1, 2, -3, 4, -5};
        assertEquals(-0.6, Mates.mediaLista(listaMixta), 0.0001);  // Media de -1, 2, -3, 4, -5 es -0.6
    }

    @org.junit.jupiter.api.Test
    void desviacionListaRecursiva() {
        // Caso con lista vacía (debe devolver NaN o un valor de error)
        double[] listaVacia = {};
        assertTrue(Double.isNaN(Mates.desviacionLista(listaVacia)));  // NaN para lista vacía

        // Caso con lista de un solo elemento (desviación estándar debe ser 0)
        double[] listaUnElemento = {10};
        assertEquals(0.0, Mates.desviacionLista(listaUnElemento), 0.0001);  // Desviación estándar de 10 es 0

        // Caso con lista de números positivos
        double[] listaPositivos = {1, 2, 3, 4, 5};
        assertEquals(1.4142, Mates.desviacionLista(listaPositivos), 0.0001);  // Desviación estándar de 1, 2, 3, 4, 5 es ~1.4142

        // Caso con lista con números negativos
        double[] listaMixta = {-1, 2, -3, 4, -5};
        assertEquals(3.5355, Mates.desviacionLista(listaMixta), 0.0001);  // Desviación estándar de -1, 2, -3, 4, -5 es ~3.5355
    }

}