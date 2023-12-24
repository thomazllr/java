package loiane_groner.AVetores.structures;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int tamanho) {
        this.elementos =  new String[tamanho];
        this.tamanho = 0;
    }

//    public void adiciona(String text) {
//        for (int i = 0; i < elementos.length; i++) {
//            if(elementos[i] == null) {
//                elementos[i] = text;
//                return;
//            }
//        }
//    }
public boolean adiciona(String text) {
        if(this.tamanho < elementos.length) {
            this.elementos[this.tamanho] = text;
            this.tamanho++;
            return true;
        }
        return false;
}


public String busca(int position) {
        if(!(position >=0 && position < tamanho)) {
            throw new IllegalArgumentException("argumento invalido fih");
        }
        return elementos[position];
}

    public int existe(String text) {

        for (int i = 0; i < tamanho; i++) {
            if(elementos[i].equals(text)){
                return i;
            }
        }
        return -1;
    }




    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tamanho -1; i++) {
            sb.append(elementos[i]);
            sb.append(", ");
        }
        if(tamanho > 0) {
            sb.append(elementos[tamanho -1]);
        }
        sb.append("]");
        return sb.toString();
    }
}
