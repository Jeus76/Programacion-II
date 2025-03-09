      import java.util.stream.IntStream;

        public class Main {
            public static void main(String[] args) {
                // Generar un stream de números
                IntStream stream = IntStream.of(1, 2, 3, 4, 5);

                // Imprimir los números del stream
                stream.forEach(System.out::print);

                IntStream stream2 = IntStream.range(1,10+1);
                stream2.forEach(System.out::println);

                IntStream.iterate(1, n -> n + 1)
                        .limit(10) // Limita a los primeros 10 números
                        .forEach(System.out::println);
            }

        }
