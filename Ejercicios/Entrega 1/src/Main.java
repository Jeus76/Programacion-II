import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Mates mates = new Mates(sc);
       System.out.println("Bienvenido, Que desea calcular? \n Por favor escriba un numero dependiendo de la accion que desea hacer: ");
        do {
            System.out.println("\n[1] La suma de 0+1+2+...+n");
            System.out.println("[2] Factorial de n");
            System.out.println("[3] La potencia n-ésima de un número natural.");
            System.out.println("[4] La suma de los elementos de una lista de números.");
            System.out.println("[5] La media aritmética de una lista de números.");
            System.out.println("[6] La desviación típica de una lista de números.");
            // faltan opciones/metodos
            System.out.println("[11] Salir");

            try {
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        mates.sumatorioN();
                        break;
                    case 2:
                        mates.factorialN();
                        break;
                    case 3:
                        mates.potenciaN();
                        break;
                    case 4:
                        mates.sumaLista();
                        break;
                    case 5:
                        mates.mediaLista();
                        break;
                    case 6:
                        mates.desviacionTipica();
                        break;
                    case 11:
                        System.out.println("Saliendo");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Mensaje de entrada no valido, ingrese un numero.");
                sc.nextLine();
                opcion = -1;
            }

        } while (opcion != 11);
    }
    }

