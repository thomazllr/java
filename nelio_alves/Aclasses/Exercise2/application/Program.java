package nelio_alves.Aclasses.Exercise2.application;

import nelio_alves.Aclasses.Exercise2.entities.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Type the employee's name ==> ");
        employee.name = sc.nextLine();
        System.out.print("Type the gross salary ==> ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Type the tax ==> ");
        employee.tax = sc.nextDouble();
        System.out.println("Employee: " + employee);

        System.out.println("===========");
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Update data: " + employee);




       sc.close();
    }
}
