package nelio_alves.Generics.ex2.entities;

import java.util.Collections;
import java.util.List;

public class CalculationService {

    public static <T extends Comparable<T>> T max(List<T> list) {
        return Collections.max(list);
    }

}
