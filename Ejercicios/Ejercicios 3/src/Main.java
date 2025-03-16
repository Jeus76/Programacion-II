      import java.util.Random;
      import java.util.stream.DoubleStream;
      import java.util.stream.IntStream;

        public class Main {
            // Ejercicio 12:  una expresión lambda es una forma concisa de definir funciones anónimas.
            // Podemos referenciar métodos anónimos o métodos sin nombre,
            // lo que nos permite escribir código más claro y conciso que  cuando usamos clases anónimas
            int n = 9;
            public static void main(String[] args) {
                // Ejercicio 14:
                // Generar un stream de números
                IntStream streamOf = IntStream.of(1, 2, 3, 4, 5);

                // Imprimir los números del stream
                streamOf.forEach(System.out::print);

                IntStream streamRango = IntStream.range(1, 10 + 1);
                streamRango.forEach(System.out::println);

                IntStream.iterate(1, n -> n + 1)
                        .limit(10) // Limita a los primeros 10 números
                        .forEach(System.out::println);

                DoubleStream streamRandom = new Random().doubles(1);
                streamRandom.forEach(System.out::println);


            }
            // Ejercicio 15
            public void sumaNStream(){
                IntStream streamSumaN = IntStream.of(IntStream.range(0, n).sum());
                
            }

        }
