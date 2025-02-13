package mates;
import java.util.*;
import java.lang.Math.*;


public class Matematicas {
    /**
     * x^2 + y^2 <= 1 [ecuacion circulo]
     *
     * @return
     */


    public static double generarNumeroPiIterativo(long pasos) {
        int i, dentro;
        float pi, total;
        double X, Y, coordenadas;
        dentro = 0;
        total = pasos;
        for (i = 0; i <= pasos; i++) {
            X = (double) (Math.random() * 1);
            Y = (double) (Math.random() * 1);
            coordenadas = X * X + Y * Y;

            if (coordenadas <= 1) {
                dentro++;
            }
        }
        pi = 4 * (dentro / total);
        System.out.println("El valor de pi es: " + pi);
        return pi;
    }
}
