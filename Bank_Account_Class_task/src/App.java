public class App {
    public static void main(String[] args) throws Exception {

        BankAccount bankAccount = new BankAccount(700.45);
        bankAccount.deposit(50);
        bankAccount.withdrawal(33.5);
        bankAccount.displayingTransactionsHistory();

        User yousef = new User("YTM.96", "1234567");
        User saleh = new User(null, null);

        yousef.createAccount();
        saleh.createAccount();
        System.out.println(yousef.getBankAccount());
        System.out.println(saleh.getBankAccount());
        BankAccount bankAccount1 = new BankAccount(5);
        BankAccount bankAccount2 = new BankAccount(8);
        // bankAccount.withdrawal(33.5);
        // bankAccount.displayingTransactionsHistory();
        BankSingleton account1 = BankSingleton.getInstance();
        BankSingleton account2 = BankSingleton.getInstance();

        account1.storeAccount(bankAccount1);
        account1.storeAccount(bankAccount2);

        System.out.println("Accounts list: " + account1.retrieveAccounts());
        System.out.println("Accounts list: " + account2.retrieveAccounts());

        yousef.display();
    }
}
