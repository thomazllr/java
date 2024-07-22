package nelio_alves.Generics.application;

import nelio_alves.Generics.entities.PrintService;

public class Program {

    public static void main(String[] args) {

        PrintService<String> print = new PrintService();


        print.add("Maria");
        print.add("Joao");
        print.add("Pedro");

        print.printList();

    }
}
