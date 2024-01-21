package old_exercises.N2.application;

import old_exercises.N2.entities.Car;
import old_exercises.N2.entities.enums.Color;

import java.util.Scanner;

import static old_exercises.N2.entities.Car.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car[] cars = new Car[25];

        int sum =0, option;
        char op;

        for (int i = 0; i < 25; i++) {
            System.out.print("Digite o ID do Carro: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite a cor do carro: ");
            String color = sc.nextLine();
            int existingId = existingID(cars, id, color);
            if(existingId != -1) {
                System.out.println("Carro existente, quantos quer adicionar? ");
                int quantity = sc.nextInt();
                sc.nextLine();
                cars[existingId].addCars(quantity);
            }
            else {
                cars[i] = new Car(id, Color.valueOf(color));
                System.out.print("Quantos carros quer adicionar? ");
                int quantity = sc.nextInt();
                sc.nextLine();
                cars[i].addCars(quantity);
            }
            System.out.println("Deseja adicionar mais um carro? ");
            op = sc.next().charAt(0);
            if (op == 'n') {
                break;
            }
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        do {
            System.out.println("\nO que voce deseja fazer? ");
            menu();
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    relatorioGeral(cars);
                    break;
            }
        } while(option != 6);

    }
}
