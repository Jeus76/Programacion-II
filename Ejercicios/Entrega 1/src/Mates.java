import java.util.Scanner;

public class Mates {
    private int n;
    private Scanner sc;
    private int carga;

    public Mates(Scanner sc) {
        this.sc = sc;
        this.n = 0;
        this.carga = 0;
    }

    public void sumatorioN() {
        System.out.print("Introduzca el número final del sumatorio: ");
        n = sc.nextInt();
        carga = 0; //

        for (int i = 1; i <= n; i++) {
            carga += i;
        }

        System.out.println("Resultado: " + carga);
    }
}
