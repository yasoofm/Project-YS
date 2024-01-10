import java.util.ArrayList;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private ArrayList<Double> transactionHistory;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        transactionHistory = new ArrayList<Double>();

    }

    public double deposit(double deposit) {
        transactionHistory.add(deposit);
        balance = balance + deposit;
        return balance;
    }

    public double withdrawal(double withdrawal) {
        transactionHistory.add(-withdrawal);
        balance = balance - withdrawal;
        return balance;
    }

    public void displayingTransactionsHistory() {

        System.out.println("\t\t\t\t\tYour Transaction History");
        for (double transaction : transactionHistory) {
            if (transaction > 0) {
                System.out.println("+" + transaction + "\n");

            } else {
                System.out.println(transaction + "\n");

            }
        }
        System.out.println("\t\t\t\t\tYour balance is: " + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Double> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(ArrayList<Double> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }
}