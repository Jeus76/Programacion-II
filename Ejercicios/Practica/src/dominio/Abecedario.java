package dominio;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;

import static java.lang.String.valueOf;

public class Abecedario {
   /**/ //public static void abcIterativo(char prim, char ulti){
      //  for (int i = (int)prim; i <= (int) ulti; i++){
        //    System.out.println((char)i + ": " + i);

        //}
    //}
  //  public static void abcRecursivo(char prim, char ulti){
 //       if (prim <= ulti){
  //          abcRecursivo(prim, (char)((int)ulti-1));
 //           System.out.println(ulti + ": " + (int)ulti);
//        }
//    }
//    public static void abcStream(char prim, char ulti){
//        IntStream.rangeClosed((int)prim, (int)ulti)
//                .forEach(x ->System.out.println((char)x));
//    }
//
 //    public static String iterativoToString(char prim, char ulti){
 //       StringBuilder sb = new StringBuilder();
 //       for (int i = (int)prim; i <= (int) ulti; i++){
 //           sb.append((char)i + ": " + i + "\n");
//
 //        }
 //       return sb.toString();
//    }
//    public static String recursivoToString(char prim, char ulti){
//        if (prim <= ulti){
 //           return recursivoToString(prim, (char)((int)ulti-1)) +
 //                   ulti + ": " + (int)ulti + "\n";
 //       }
 //       else return "";
 //   }
 //   public static String streamToString(char prim, char ulti){
 //       return Stream.iterate((int)prim,actual->actual+1)
  //              .limit(ulti)
  //              .map(x->Character.valueOf(x))
  //              .reduce()






//int n = sc.nextDouble;

        public static double taylorIterativo(double x, double n){
            double sum = 1.0;
            double term = 1.0;
            for (int k = 1; k <= n; k++) {
                term *= x / k;
                sum += term;
            }
            return sum;

    }
    public static double taylorRecursivo(double x, double n){
        if (n==0) {
            return 1;
        }else {
            return (x/n) * taylorRecursivo(x, n-1)+1;
        }
    }



}
