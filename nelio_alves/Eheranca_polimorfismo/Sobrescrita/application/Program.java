package nelio_alves.Eheranca_polimorfismo.Sobrescrita.application;

import nelio_alves.Eheranca_polimorfismo.Sobrescrita.entities.Account;
import nelio_alves.Eheranca_polimorfismo.Sobrescrita.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account ac1 = new Account(1001, "Alex", 1000.0);

        ac1.withdraw(200.00);
        System.out.println(ac1.getBalance());

        Account ac2 = new SavingsAccount(1002, "maria", 1000.0, 01.0);
        ac2.withdraw(200);
        System.out.println(ac2.getBalance());


    }
}
