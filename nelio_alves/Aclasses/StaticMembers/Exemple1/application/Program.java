package nelio_alves.Aclasses.StaticMembers.Exemple1.application;

import nelio_alves.Aclasses.StaticMembers.Exemple1.util.Calculator;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius ==> ");
        double radius = sc.nextDouble();

        System.out.printf("Circumference: %.2f\n", Calculator.circumference(radius));
        System.out.printf("Volume: %.2f\n", Calculator.volume(radius));
        System.out.printf("PI: %.2f\n",  Calculator.PI);
    }
}
