package nelio_alves.Carrays.Exemple.application;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double media = 0;

        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Type a number %d: ", i + 1);
            vect[i] = sc.nextDouble();
            media += vect[i];
        }

        media = media / n;

        System.out.printf("AVERAGE HEIGHT = %.2f\n\n", media);

        System.out.println(Arrays.toString(vect));

    }
}
