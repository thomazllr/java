package nelio_alves.Klambda.streams.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> stream = integers.stream().map(x -> x * 10);

        Stream<String> streamString = Stream.of("Alex", "Maria", "Bob");

        System.out.println(Arrays.toString(stream.toArray()));
        System.out.println(Arrays.toString(streamString .toArray()));


        Stream<Integer> integerStream = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(integerStream.limit(10).toArray()));

        Stream<Long> fibo = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(fibo.limit(1000).toArray()));

    }
}
