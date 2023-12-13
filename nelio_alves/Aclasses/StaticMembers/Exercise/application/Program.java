package nelio_alves.Aclasses.StaticMembers.Exercise.application;

import nelio_alves.Aclasses.StaticMembers.Exercise.util.CurrencyConverter;

import java.util.Currency;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dollar = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double bought = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.paid(dollar, bought));

        sc.close();
    }
}
