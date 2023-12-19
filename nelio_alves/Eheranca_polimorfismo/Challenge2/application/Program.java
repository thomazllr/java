package nelio_alves.Eheranca_polimorfismo.Challenge2.application;

import nelio_alves.Eheranca_polimorfismo.Challenge2.entities.Company;
import nelio_alves.Eheranca_polimorfismo.Challenge2.entities.Individual;
import nelio_alves.Eheranca_polimorfismo.Challenge2.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("\nTax payer #%d data:\n", i + 1);
            System.out.print("Individual or company (i/c)? ");
            char op = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.println("Anual income: ");
            Double income = sc.nextDouble();
            sc.nextLine();
            if(op == 'i') {
                System.out.println("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                sc.nextLine();
                taxPayers.add(new Individual(name, income, healthExpenditures));
            }
            else {
                System.out.println("Number of employees: ");
                Integer numberEmployees = sc.nextInt();
                sc.nextLine();
                taxPayers.add(new Company(name, income, numberEmployees));
            }
        }

        double sum = 0;
        for(TaxPayer tp : taxPayers) {
            System.out.println(tp);
            sum += tp.paid();
        }
        System.out.println("\nTOTAL TAXES $ " + sum);

        sc.close();
    }
}
