package nelio_alves.Fexceptions.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String[] text = sc.nextLine().split(" ");

            System.out.println("Digite uma posicao: ");
            int n = sc.nextInt();
            sc.nextLine();
            System.out.println(text[n]);

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fazendo bosta");
        }
        catch (InputMismatchException e) {
            System.out.println("Input Invalido ");
        }
        System.out.println("Programa continuando...");


        sc.close();
    }
}
