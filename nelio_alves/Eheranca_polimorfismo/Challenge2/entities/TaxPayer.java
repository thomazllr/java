package nelio_alves.Eheranca_polimorfismo.Challenge2.entities;

public abstract class TaxPayer {
    protected String name;
    protected Double incomeYear;

    public TaxPayer(String name, Double incomeYear) {
        this.name = name;
        this.incomeYear = incomeYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getIncomeYear() {
        return incomeYear;
    }

    public abstract double paid();
}
