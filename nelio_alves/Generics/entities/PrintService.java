package nelio_alves.Generics.entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    private List<T> list = new ArrayList<>();

    public void add(T t) {
        list.add(t);
    }

    public T getFirst() {
        return list.get(0);
    }

    public void printList() {
        for (T t : list) {
            System.out.print(t + ", ");
        }
        System.out.println("END");
    }
}
