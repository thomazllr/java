package nelio_alves.HashCode.application;

import nelio_alves.HashCode.entities.Client;

public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("Alex", "alex@gmail");
        Client c2 = new Client("Alex", "alex@gmail");

        String nome = "jose";


        System.out.println(c1.hashCode());

        System.out.println(c2.hashCode());

        System.out.println(c1.equals(c2));

    }
}
