package nelio_alves.Aclasses.OOP_Triangle.application;
import nelio_alves.Aclasses.OOP_Triangle.entities.Triangle;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        double areaX, areaY;

        System.out.println("Enter the measures of the triangle X ==> ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of the triangle Y ==> ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        areaX = x.Area();
        areaY = y.Area();

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
