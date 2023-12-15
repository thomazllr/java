package nelio_alves.Bencapsulamento.Exercise.entities;

public class Account {
    private int number;
    private String name;
    private double balance;


    public Account(int number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double depositValue(double value) {
        return balance += value;
    }

    public double withdrawValue(double value) {
        return balance -= value;
    }

    @Override
    public String toString() {
        return "Account data: \n"+
                "Account " + number +
                ", Holder: " + name +
                ", Balance: $ " + balance;
    }
}

