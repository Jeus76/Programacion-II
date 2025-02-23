public class Main {


    public static void main(String[] args){
        int n = 7;
        int [] listado = {1,2,3,4,7};
        double [] dListado = {1,2,3,4,7};
        Mates mates = new Mates();
        System.out.println("El sumatorio de " + n + " es: " + mates.sumatorioN(7));
        System.out.println("El factorial de " + n + " es: " + mates.factorialN(7));
        System.out.println("La potencia de 2 a la 6 es " + mates.potenciaN(2,6));
        System.out.println("La suma de la lista de numeros [1, 2, 3, 4 ,7] es: " + mates.sumaLista(listado,0));
        System.out.println("La media de la lista de numeros [1, 2, 3, 4, 7] es: " + mates.mediaListaRecursiva(listado,4));
        System.out.println("La desviación típica de una lista de numeros [1,2,3,4,7] es: " + mates.desviacionListaRecursiva(dListado, 4));
        System.out.println("La suma de pares hasta 7 es: " + mates.sumaPares(7));
        System.out.println("La suma de pares de una lista de numeros [1,2,3,4,7] es: " + mates.sumaParesLista(listado,4));


    }
}
