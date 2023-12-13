package nelio_alves.Aclasses.Exercise1.application;

import nelio_alves.Aclasses.Exercise1.entities.Rectangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Type the width of the rectangle ==>  ");
        rectangle.width = sc.nextDouble();
        System.out.print("Type the height of the rectangle ==>  ");
        rectangle.height = sc.nextDouble();

        System.out.println("----------");
        System.out.println(rectangle);


    }
}
