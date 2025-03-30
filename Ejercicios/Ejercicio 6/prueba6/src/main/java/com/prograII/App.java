package com.prograII;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor del exponente: ");
        double x = sc.nextDouble();  // Cambio a double para mayor precisión
        System.out.println("Ingrese el número de sumandos: ");
        int n = sc.nextInt();

        double resultado = expTaylor(x, n);
        System.out.println("Aproximación de e^" + x + " = " + resultado);

        sc.close(); // Cierra el Scanner para evitar fugas de recursos
    }

    // Metodo separado para calcular la serie de Taylor
    public static double expTaylor(double x, int n) {
        double sum = 1.0;  // Primer término 1 (x^0 / 0!)
        double term = 1.0; // Almacena x^k / k!

        for (int k = 1; k <= n; k++) {  // Empieza en k = 1
            term *= x / k;  // Calcula el siguiente término
            sum += term;    // Suma el término a la serie
        }

        return sum;
    }
}


