package nelio_alves.Eheranca_polimorfismo.Abstract.Methods.application;

import nelio_alves.Eheranca_polimorfismo.Abstract.Methods.entities.Circle;
import nelio_alves.Eheranca_polimorfismo.Abstract.Methods.entities.Rectangle;
import nelio_alves.Eheranca_polimorfismo.Abstract.Methods.entities.Shape;
import nelio_alves.Eheranca_polimorfismo.Abstract.Methods.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("\nShape #%d data: \n", i +  1);
            System.out.print("Rectangle or Circle (r/c)? ");
            char shape = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color(BLACK/BLUE/RED): ");
            String color = sc.nextLine();
            if(shape == 'r') {
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                sc.nextLine();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                sc.nextLine();
                shapes.add(new Rectangle(Color.valueOf(color),width, height));
            }
            else {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                sc.nextLine();
                shapes.add(new Circle(Color.valueOf(color), radius));
            }
        }

        System.out.println("SHAPE AREAS: ");
        for(Shape s : shapes) {
            System.out.println(s);
        }

    }
}
