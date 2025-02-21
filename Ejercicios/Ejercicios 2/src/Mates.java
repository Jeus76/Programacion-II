import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mates {
    private long n;
    private Scanner sc;
    private int carga;
    private int natural;
    List<Integer> numeros = new ArrayList<>();

    public Mates() {
        this.n = 0;
        this.carga = 0;
        this.natural = 0;
    }



    public void sumatorioN() {
    System.out.print("Introduzca el número final del sumatorio: ");
    n = 6;
    carga = 0;

    for (int i = 1; i <= n; i++) {
        carga += i;
    }
    System.out.println("Resultado: " + carga);
}

    public void factorialN() {
        System.out.println("Introduzca el numero final del factorial: ");
        n = sc.nextInt();
        carga = 1;
        for (int i = 1; i <= n; i++) {
            carga *= i;

        }
        System.out.println("Resultado: " + carga);
    }

    public void potenciaN() {
        System.out.println("Introduzca el numero natural que desea potenciar: ");
        natural = sc.nextInt();
        System.out.println("Introduzca la potencia: ");
        n = sc.nextInt();
        carga = 1;
        for (int i = 0; i < n; i++) {
            carga *= natural;
        }
        System.out.println("Resultado: " + carga);
    }

    public void sumaLista() {
        System.out.println("Ingrese la cantidad de números en la lista:");
        int cantidad = sc.nextInt();

        System.out.println("Ingrese los números:");
        for (int i = 0; i < cantidad; i++) {
            numeros.add(sc.nextInt());
        }

        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }

        System.out.println("Suma de los elementos de la lista: " + suma);

    }

    public void mediaLista() {
        System.out.println("Ingrese la cantidad de números en la lista:");
        int cantidad = sc.nextInt();

        if (cantidad == 0) {
            System.out.println("No se puede calcular la media de una lista vacía.");
            return;
        }

        System.out.println("Ingrese los números:");
        for (int i = 0; i < cantidad; i++) {
            numeros.add(sc.nextInt());
        }

        int suma = 0;
        for (int num : numeros) {
            suma += num;

        }

        double media = (double) suma / cantidad;
        System.out.println("Media aritmética de la lista: " + media);

    }
    public void desviacionTipica() {
        List<Integer> numeros = new ArrayList<>();
        System.out.println("Ingrese la cantidad de números en la lista:");
        int cantidad = sc.nextInt();

        if (cantidad == 0) {
            System.out.println("No se puede calcular la desviación típica de una lista vacía.");
            return;
        }

        System.out.println("Ingrese los números:");
        for (int i = 0; i < cantidad; i++) {
            numeros.add(sc.nextInt());
        }

        // Calcular la media
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        double media = (double) suma / cantidad;

        // Calcular la varianza
        double sumaDifCuadradas = 0;
        for (int num : numeros) {
            sumaDifCuadradas += Math.pow(num - media, 2);
        }
        double varianza = sumaDifCuadradas / cantidad;

        // Calcular la desviación típica
        double desviacion = Math.sqrt(varianza);

        System.out.println("Desviación típica de la lista: " + desviacion);
    }
    public static int sumaPares(int n) {
        if (n < 2) return 0;
        if (n % 2 != 0) return sumaPares(n - 1);
        return n + sumaPares(n - 2);
    }
    public static int sumaParesLista(int[] lista, int i) {
        if (i >= lista.length) return 0;
        return (lista[i] % 2 == 0 ? lista[i] : 0) + sumaParesLista(lista, i + 1);
    }
}
