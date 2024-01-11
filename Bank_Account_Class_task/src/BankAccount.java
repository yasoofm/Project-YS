import java.util.ArrayList;

public class BankAccount {

    private int accountNumber;
    private static int id = 1;
    private double balance;
    private ArrayList<Double> transactionHistory;

    public BankAccount(double balance) {
        accountNumber = id;
        id++;
        this.balance = balance;
        transactionHistory = new ArrayList<Double>();

    }

    public double deposit(double deposit) {
        transactionHistory.add(deposit);
        balance = balance + deposit;
        return balance;
    }

    public double withdrawal(double withdrawal) {
        if (balance > 0 && balance - withdrawal > 0) {
            transactionHistory.add(-withdrawal);
            balance = balance - withdrawal;
        } else {
            System.out.println("Failed to withdraw: Insufficient balance");
        }
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

    @Override
    public String toString() {
        return Integer.toString(accountNumber);
    }
}
