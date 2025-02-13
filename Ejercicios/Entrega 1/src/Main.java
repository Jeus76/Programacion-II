import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mates mates = new Mates(sc);
        mates.sumatorioN();
        sc.close();
    }
}