package nelio_alves.Aclasses;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double xA,xB,xC, yA,yB,yC;
        double areaX, areaY;

        System.out.println("Enter the measures of the triangle X ==> ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures of the triangle Y ==> ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = ((xA + xB + xC) / 2.0);
        double p2 = ((yA + yB + yC) / 2.0);

        areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
        areaY = Math.sqrt(p2*(p2-yA)*(p2-yB)*(p2-yC));

        System.out.printf("Area of Triangle X ==> %.2f%n", areaX);
        System.out.printf("Area of Triangle Y ==> %.2f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Area of Triangle X is bigger");
        }
        else {
            System.out.println("Area of Triangle Y is bigger");
        }




        sc.close();
    }
}
