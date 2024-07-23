package nelio_alves.Iset.challenge.application;

import nelio_alves.Iset.challenge.entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Student> students = new HashSet<>();

        char course = 'A';

        for (int i = 0; i < 3; i++) {
            System.out.print("How many students for course " + course++ + "? ");
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                Integer id = sc.nextInt();
                students.add(new Student(id));
            }
        }
        System.out.println("Total Students: " + students.size());

        sc.close();
    }
}
