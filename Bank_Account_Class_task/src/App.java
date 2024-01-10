public class App {
    public static void main(String[] args) throws Exception {
        BankAccount bankAccount1 = new BankAccount(5, 0);
        BankAccount bankAccount2 = new BankAccount(8, 0);
        // bankAccount.withdrawal(33.5);
        // bankAccount.displayingTransactionsHistory();
        BankSingleton account1 = BankSingleton.getInstance();
        BankSingleton account2 = BankSingleton.getInstance();

        account1.storeAccount(bankAccount1);
        account1.storeAccount(bankAccount2);

        System.out.println("Accounts list: " + account1.retrieveAccounts());
        System.out.println("Accounts list: " + account2.retrieveAccounts());

    }
}
