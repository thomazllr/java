package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, BiFunction<Float, Float, Float>> namedFunctions = new HashMap<>() {{
            put("*", (x, y) -> x * y);
            put("+", Float::sum);
            put("/", (x, y) -> x / y);
            put("-", (x, y) -> x - y);
        }};

        String option;
        do {
            System.out.println("What you want to do: ");
            System.out.println("+ (Add)\n" +
                    "- (Minus)\n" +
                    "/ (Division)\n" +
                    "* (Mutiply)\n" +
                    "0 - Exit");
            System.out.print("Choose an option: ");
            option = sc.nextLine();

            System.out.print("Number 1: ");
            Float num1 = sc.nextFloat();
            System.out.print("Number 2: ");
            Float num2 = sc.nextFloat();

            var result = namedFunctions.get(option).apply(num1, num2);

            System.out.printf("Result: %.2f\n", result);

            System.out.println("Press enter to continue...");
            sc.nextLine();
            sc.nextLine();


        } while (!Objects.equals(option, "0"));


    }
}
