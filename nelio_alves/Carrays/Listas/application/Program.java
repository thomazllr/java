package nelio_alves.Carrays.Listas.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("guilherme");
        list.add("ben");
        list.add("bob");
        list.add("jorge");

        list.add(2, "marco");
        list.add(0, "jhenni");
        list.remove("thommy");

        System.out.println(list.size());

        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("-------------");
        list.removeIf(name -> name.charAt(0) == 'b');
        System.out.println(list.size());
        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("-------------");
//        List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList()); -> Old Style
          List<String> result = list.stream().filter(x -> x.charAt(0) == 'j').toList();
        for (String name : result) {
            System.out.println(name);
        }
        System.out.println("-------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'g').findFirst().orElse(null);
        System.out.println(name);
    }
}
