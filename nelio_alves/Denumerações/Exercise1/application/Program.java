package nelio_alves.Denumerações.Exercise1.application;

import nelio_alves.Denumerações.Exercise1.entities.Department;
import nelio_alves.Denumerações.Exercise1.entities.HourContract;
import nelio_alves.Denumerações.Exercise1.entities.Worker;
import nelio_alves.Denumerações.Exercise1.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Base salary: ");
        Double salary = sc.nextDouble();
        sc.nextLine();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("\nEnter contract #%d data:", i + 1);
            System.out.print("Date (DD/MM/YYYY): ");
            String data = sc.nextLine();
            Date date = formatter.parse(data);
            System.out.print("Value per hour: ");
            Double value = sc.nextDouble();
            sc.nextLine();
            System.out.print("Duration (hours): ");
            Integer hours = sc.nextInt();
            sc.nextLine();
            HourContract contract = new HourContract(date, value, hours);
            worker.addContract(contract);
        }

        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));;
        System.out.println(worker);
        System.out.println("Income: " + month + "/" + year + " " + String.format("%.2f", worker.income(month, year)));




    }
}
