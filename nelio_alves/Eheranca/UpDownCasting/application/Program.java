package nelio_alves.Eheranca.UpDownCasting.application;

import nelio_alves.Eheranca.UpDownCasting.entities.Account;
import nelio_alves.Eheranca.UpDownCasting.entities.BusinessAccount;
import nelio_alves.Eheranca.UpDownCasting.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account ac = new Account(1001, "Alex", 0.0);
        BusinessAccount ba = new BusinessAccount(1002, "Maria", 0.0, 500.00);


        //UPCASTING

        Account acc1 = ba;
        acc1.getBalance();

        Account acc2 = new BusinessAccount(1003, "Pedro", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;



    }
}
