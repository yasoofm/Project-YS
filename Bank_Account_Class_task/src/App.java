public class App {
    public static void main(String[] args) throws Exception {
        BankAccount bankAccount = new BankAccount(700.45);
        bankAccount.deposit(50);
        bankAccount.withdrawal(33.5);
        bankAccount.displayingTransactionsHistory();

        User yousef = new User(null, null);
        User saleh = new User(null, null);

        yousef.createAccount();
        saleh.createAccount();
        System.out.println(yousef.getBankAccount());
        System.out.println(saleh.getBankAccount());
    }
}
