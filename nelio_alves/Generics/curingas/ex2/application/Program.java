package nelio_alves.Generics.curingas.ex2.application;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Object> todos = new ArrayList<>();

        List<Integer> integers = new ArrayList<Integer>();

        integers.add(1);
        integers.add(2);
        integers.add(3);

        copy(integers, todos);

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.5);
        doubles.add(2.3);
        doubles.add(3.5);


        copy(doubles, todos);


        print(todos);
    }


    public static void copy(List<? extends Number> source, List<? super Number> target) {
        target.addAll(source);
    }

    public static void print(List<?> source) {
        System.out.print("[ ");
        for (Object obj : source) {
            System.out.print(obj + ", ");
        }

        System.out.println("]");
    }
}
