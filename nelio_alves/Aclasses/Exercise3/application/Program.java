package nelio_alves.Aclasses.Exercise3.application;

import nelio_alves.Aclasses.Exercise3.entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Type the student name: ");
        student.name = sc.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.printf("Type the %dº grade: ", i + 1);
            student.grades[i] = sc.nextDouble();
        }

        System.out.println(student);
    }
}
