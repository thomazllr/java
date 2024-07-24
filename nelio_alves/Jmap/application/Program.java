package nelio_alves.Jmap.application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Map<String,String> map = new TreeMap<>();

        map.put("username", "Maria");
        map.put("email", "maria@gmail.com");
        map.put("telefone", "999999");

        map.remove("username");

        System.out.println(map);

    }
}
