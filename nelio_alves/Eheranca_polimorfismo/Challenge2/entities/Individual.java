package nelio_alves.Eheranca_polimorfismo.Challenge2.entities;

public class Individual extends TaxPayer {

    protected Double healthExpenditures;

    public Individual(String name, Double incomeYear, Double healthExpenditures) {
        super(name, incomeYear);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    @Override
    public double paid() {
        if (healthExpenditures > 0) {
            if(incomeYear < 20000) {
                return incomeYear * 0.15 - (healthExpenditures * 0.50);
            }
            if(incomeYear > 20000) {
                return incomeYear * 0.25- (healthExpenditures * 0.50);
            }
        }
        else {
            if(incomeYear < 20000) {
                return incomeYear * 0.15;
            }
            if(incomeYear > 20000) {
                return incomeYear * 0.25;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + ": $ " + String.format("%.2f", paid()));
        return sb.toString();
    }
}
