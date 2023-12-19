package nelio_alves.Eheranca_polimorfismo.Exercise1.entities;

public class OutsorcedEmployee extends Employee {

    protected Double additionalCharge;

    public OutsorcedEmployee() {
    }

    public OutsorcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.10;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + " - $ " + payment());
        return sb.toString();
    }
}
