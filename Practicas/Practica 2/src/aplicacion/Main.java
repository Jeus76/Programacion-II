package aplicacion;

import mates.Matematicas;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de dardos lanzados: ");
        long pasos = sc.nextLong();
        System.out.println("El número PI es " + Matematicas.generarNumeroPi(pasos));
    }
}