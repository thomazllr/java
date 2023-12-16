package nelio_alves.Carrays.Challenge.application;

import nelio_alves.Carrays.Challenge.entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[10];

        for (int i = 0; i < n; i++) {
            System.out.printf("\n\nRent #%d\n", i + 1);
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Room: ");
            int room = sc.nextInt();
            sc.nextLine();
            students[room] = new Student(name, email, room);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < students.length; i++) {
            if(students[i] != null) {
                System.out.println(students[i]);
            }
        }


    }
}
