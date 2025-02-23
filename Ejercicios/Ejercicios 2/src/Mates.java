
public class Mates {


    /**
     * 1. La suma 0 + 1 + 2 + ... + n.
     * 2. El factorial de un número.
     * 3. La potencia n-ésima de un número natural.
     * 4. La suma de los elementos de una lista de números.
     */
    public static int sumatorioN(int n) {

        if (n <= 0) {
            return 0;
        } else {
            return n + sumatorioN(n - 1);
        }
    }
    public static int factorialN(int n) {
        if (n <= 1) {
            return 1;
        }else {
            return  n *= factorialN(n - 1);     }
    }
    public static int potenciaN(int natural, int n) {
        if (n == 0){
            return 1;
        } else {
            return natural * potenciaN(natural, n-1);
        }
    }
    public static int sumaLista(int[] lista, int n) {
        if ( n == lista.length) {
            return 0;
        }
        return lista[n] + sumaLista(lista, n + 1);
    }
    public static double mediaLista(int [] comandos){
        int elementos = comandos.length;
        double suma = mediaListaRecursiva(comandos, elementos-1);
        return suma/elementos;
    }
    public static double mediaListaRecursiva(int [] comandos, int elementos){
        if (elementos >= 0) {
            return comandos [elementos] + mediaListaRecursiva(comandos, elementos - 1);
        }else{
            return 0;
        }
    }
    public static double desviacionLista(double [] comandos) {
        int elementos = comandos.length;
        double suma = desviacionListaRecursiva(comandos,elementos);
        double media = suma/elementos;
        double sumaDiferenciasCuadradas = desviacionListaRecursiva1(comandos,media, elementos);
        return Math.sqrt(sumaDiferenciasCuadradas/elementos);
    }
    public static double desviacionListaRecursiva(double [] comandos,int elementos) {
        if (elementos >= 0) {
            return comandos [elementos] + desviacionListaRecursiva(comandos, elementos - 1);
        } else {
            return 0;
        }
    }
    public static double desviacionListaRecursiva1(double [] comandos, double media, int elementos) {
        if (elementos >= 0) {
            return Math.pow(comandos[elementos]-media,2) + desviacionListaRecursiva1(comandos,media,elementos - 1);
        } else {
            return 0;
        }
    }
    public static int sumaPares(int n){
        if (n>0){
            if (n%2==0){
                return n + sumaPares(n-2);
            } else {
                return sumaPares(n-1);
            }
        } else {
            return 0;
        }
    }
    public static int sumaParesLista(int [] comandos, int n){
        if (n>=0){
            if (comandos[n]%2==0){
                return comandos[n] + sumaParesLista(comandos, n-1);
            } else {
                return sumaParesLista(comandos, n-1);
            }
        } else {
            return 0;
        }
    }


}