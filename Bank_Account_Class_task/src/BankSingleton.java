import java.util.ArrayList;

public class BankSingleton {
    private static ArrayList<BankAccount> accounts;
    private static BankSingleton instance;

    public static BankSingleton getInstance() {
        if (instance == null) {
            instance = new BankSingleton();
            accounts = new ArrayList<BankAccount>();
        }
        return instance;
    }

    public void storeAccount(BankAccount account) {
        // Code to store account
        accounts.add(account);

    }

    public ArrayList<BankAccount> retrieveAccounts() {
        // Code to retrieve account
        return accounts;
    }

}
