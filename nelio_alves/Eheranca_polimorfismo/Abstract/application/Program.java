package nelio_alves.Eheranca_polimorfismo.Abstract.application;

import nelio_alves.Eheranca_polimorfismo.Abstract.entities.Account;
import nelio_alves.Eheranca_polimorfismo.Abstract.entities.BusinessAccount;
import nelio_alves.Eheranca_polimorfismo.Abstract.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {


//        Account ac1 = new Account(1001, "Alex", 1000.0);

        Account ac2 = new SavingsAccount(1002, "Maria", 1000.0, 0.10);

        Account ac3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);


    }
}
