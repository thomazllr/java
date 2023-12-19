package nelio_alves.Eheranca_polimorfismo.Exercise1.application;

import nelio_alves.Eheranca_polimorfismo.Exercise1.entities.Employee;
import nelio_alves.Eheranca_polimorfismo.Exercise1.entities.OutsorcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("\nEmployee #%d data: \n", i + 1);
            System.out.print("Outsourced (y/n)? ");
            char out = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Value per hours: ");
            Double value = sc.nextDouble();
            if(out == 'y') {
                System.out.print("Additional charge: ");
                Double add = sc.nextDouble();
                Employee employeeOut = new OutsorcedEmployee(name, hours, value, add);
                employees.add(employeeOut);
                continue;
            }
            Employee employee = new Employee(name, hours, value);
            employees.add(employee);
        }

        System.out.println("PAYMENTS: ");
        for (Employee e : employees) {
            System.out.println(e);
        }

        sc.close();
    }
}
