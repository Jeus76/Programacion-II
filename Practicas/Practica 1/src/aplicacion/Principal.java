package aplicacion;

import mates.Matematicas;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de pasos: ");
        long pasos = sc.nextLong();

            Matematicas.generarNumeroPiIterativo(pasos);

        if (pasos < 0) {
            System.out.println("El numero de pasos debe ser mayor que 0");
        }

    }
}
