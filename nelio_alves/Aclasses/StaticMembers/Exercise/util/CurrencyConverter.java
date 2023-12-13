package nelio_alves.Aclasses.StaticMembers.Exercise.util;

public class CurrencyConverter {
    public static double IOF = 0.06;


    public static double paid(double dollar, double bought) {
        return dollar * bought * (1.0 + IOF);
    }
}
