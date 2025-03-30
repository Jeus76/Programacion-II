package dominio;

import java.util.stream.IntStream;

public class FlowBellako {

    public static IntStream oal() {
        IntStream numStream = IntStream.rangeClosed(0, 100)
                .filter(i -> i % 2 == 1);


        return numStream;
    }
}