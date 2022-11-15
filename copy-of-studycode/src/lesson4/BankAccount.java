package lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;
    BankAccount (int newid, String newname, double newbalance){
        id = newid;
        name = newname;
        balance = newbalance;
    }
    void popolnenieScheta (double balanceUp){
        System.out.println("Balance before balance up: " + balance);
        balance += balanceUp;
        System.out.println("Balance after balance up: " + balance + '\n');
    }
    void snyatieSoScheta (double balanceDown){
        System.out.println("Balance before balance down: " + balance);
        balance -= balanceDown;
        System.out.println("Balance after balance down: " + balance + '\n');
    }
    void BankAccountInfo (){
        System.out.println("Account id: " + id);
        System.out.println("Account name: " + name);
        System.out.println("Banalnce count: " + balance + '\n');
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(5, "Andrew", 50.34);
        BankAccount account2 = new BankAccount(2, "Mike", 34.53);

        account1.BankAccountInfo();
        account2.BankAccountInfo();

        account1.popolnenieScheta(50);
        account2.snyatieSoScheta(50);

        account1.BankAccountInfo();
        account2.BankAccountInfo();
    }
}
