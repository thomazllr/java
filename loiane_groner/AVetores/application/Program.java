package loiane_groner.AVetores.application;

import loiane_groner.AVetores.structures.Vetor;

public class Program {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Thomaz");
        vetor.adiciona("Cassio");
        vetor.adiciona("Pedro");

        System.out.println(vetor.getTamanho());
        System.out.println("Posicao: " + vetor.busca(2));
        System.out.println("Existe: " + vetor.existe("Cassio"));

        System.out.println(vetor);
    }
}
