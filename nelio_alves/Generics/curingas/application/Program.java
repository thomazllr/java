package nelio_alves.Generics.curingas.application;

import nelio_alves.Generics.curingas.entities.Circle;
import nelio_alves.Generics.curingas.entities.Rectangle;
import nelio_alves.Generics.curingas.interfaces.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        List<Circle> circles = new ArrayList<>();

        shapes.add(new Rectangle(3.0,2.0));
        shapes.add(new Circle(2.0));

        System.out.printf("%.2f%n", totalArea(shapes));

        circles.add(new Circle(3.0));
        circles.add(new Circle(2.0));
        System.out.printf("%.2f%n", totalArea(circles));


    }

    public static double totalArea(List<? extends Shape> list) {

        double sum = 0;
        for (Shape shape : list) {
            sum += shape.getArea();
        }
        return sum;
    }
}
