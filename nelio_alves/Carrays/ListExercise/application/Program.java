package nelio_alves.Carrays.ListExercise.application;

import nelio_alves.Carrays.ListExercise.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i =0; i< n; i++) {
            System.out.printf("\nEmployee %d\n", i + 1);
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            Employee employee = new Employee(id, name, salary);
            employeeList.add(employee);
        }
        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        for (Employee employee : employeeList) {
            if(employee.getId() == id) {
                System.out.println("Enter the percentage: ");
                double percent = sc.nextDouble();
                sc.nextLine();
                employee.increaseSalary(percent);
            }
            else {
                System.out.println("This id does not exist!");pp
                break;
            }
        }

        System.out.println("List of employees: ");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }



    }
}
