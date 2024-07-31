package test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Program {
    public static void main(String[] args) {

        Map<String, BiFunction<Float, Float, Float>> namedFunctions = new HashMap<>() {{
            put("multiply", (x, y) -> x * y);
            put("add", Float::sum);
            put("division", (x,y) -> x / y);
            put("sub", (x,y) -> x - y);
        }};


        System.out.println(namedFunctions.get("add").apply(3.0F, 4.0F));
    }
}
