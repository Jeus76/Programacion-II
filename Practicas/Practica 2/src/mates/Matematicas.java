package mates;
import java.lang.Math;

public class Matematicas{
    private int aciertos;
    private int total;
    public static float generarNumeroPi(long pasos){
        float pi = 0;
        
        if (pasos == 0){
            return pi;
        }else {
            int aciertos = generarNumeroPiRecursivo(pasos);
            float total = pasos;
            pi = 4 * aciertos / total;
            return pi;
        }
    }

    public static int generarNumeroPiRecursivo(long pasos){
        int aciertos;
        float pi, total;
        double x, y, resultado;
        x = Math.random();
        y = Math.random();
        resultado = x*x + y*y;
        if (pasos == 0){
            return 0;
        }else{
            if (resultado <= 1) {
                aciertos = 1 + generarNumeroPiRecursivo(pasos - 1);
            }else{
                aciertos = 0 + generarNumeroPiRecursivo(pasos - 1);
            }
            return aciertos;
        }
        
    }
}