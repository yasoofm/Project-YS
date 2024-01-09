public class App {
    public static void main(String[] args) throws Exception {
        BankAccount bankAccount = new BankAccount(1234567898, 700.45);
        bankAccount.deposit(50);
        bankAccount.withdrawal(33.5);
        bankAccount.displayingTransactionsHistory();
    }
}
