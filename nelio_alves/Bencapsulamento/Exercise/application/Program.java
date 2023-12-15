package nelio_alves.Bencapsulamento.Exercise.application;

import nelio_alves.Bencapsulamento.Exercise.entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder: ");
        String name = sc.nextLine();
        Account account = new Account(number, name);

        System.out.println("Is there na initial deposit (y/n)? ");
        char option = sc.next().charAt(0);
        sc.nextLine();
        if(option == 'y') {
            System.out.println("Enter initial deposit value: ");
            double balance = sc.nextDouble();
            account.depositValue(balance);
        }

        System.out.println(account);

        System.out.println("---------------");
        System.out.println("Enter a deposit value: ");
        double balance = sc.nextDouble();
        account.depositValue(balance);
        System.out.println(account);
        System.out.println("----------------");

        System.out.println("Enter a withdraw value: ");
        balance = sc.nextDouble();
        account.withdrawValue(balance);
        System.out.println(account);

    }
}
