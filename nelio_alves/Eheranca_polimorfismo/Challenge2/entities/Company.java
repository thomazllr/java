package nelio_alves.Eheranca_polimorfismo.Challenge2.entities;

public class Company extends TaxPayer {

    protected Integer numberEmployess;

    public Company(String name, Double incomeYear, Integer numberEmployess) {
        super(name, incomeYear);
        this.numberEmployess = numberEmployess;
    }

    @Override
    public double paid() {
        if(numberEmployess > 10) {
            return incomeYear * 0.14;
        }
        return incomeYear * 0.16;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + ": $ " + String.format("%.2f", paid()));;
        return sb.toString();
    }
}
