import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        BankSingleton bankSingleton = BankSingleton.getInstance();
        Scanner in = new Scanner(System.in);
        int choice = 0;

        System.out.println("*******************************************************");
        System.out.println("\t\t\tWELCOME");
        System.out.println("*******************************************************");

        while (true) {
            label1: {
                System.out.println("- Enter 1 to create an account");
                System.out.println("- Enter 2 to log in to an existing account");
                System.out.println("- Enter 0 exit the program");
                while (true) {
                    try {
                        choice = in.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input: Enter a number");
                    }
                }
                switch (choice) {
                    case 1:
                        User user = new User();
                        break;
                    case 2:
                        if (bankSingleton.authenticate()) {
                            for (User temp : User.usersList) {
                                if (temp.getUsername().equals(BankSingleton.usernameInput)) {
                                    User loggedUser = temp;
                                    while (true) {
                                        System.out.println("*******************************************************");
                                        System.out.println("- Enter 1 to select a bank account");
                                        System.out.println("- Enter 2 to create a new bank account");
                                        System.out.println("- Enter 3 to display bank accounts");
                                        System.out.println("- Enter 9 to return to previous list");
                                        System.out.println("- Enter 0 exit the program");

                                        try {
                                            choice = in.nextInt();
                                        } catch (InputMismatchException e) {
                                            System.out.println("Invalid input: Enter a number");
                                        }

                                        switch (choice) {
                                            case 1:
                                                System.out.print("Enter account number: ");
                                                int accountNumber = in.nextInt();
                                                BankAccount selectedAccount = null;
                                                for (BankAccount account : loggedUser.getBankAccounts()) {
                                                    if (account.getAccountNumber() == accountNumber) {
                                                        selectedAccount = account;
                                                        break;
                                                    }
                                                }
                                                if (selectedAccount != null) {
                                                    label2: {
                                                        while (true) {
                                                            System.out
                                                                    .println(
                                                                            "*******************************************************");
                                                            System.out.println("- Enter 1 to make deposit");
                                                            System.out.println("- Enter 2 to make a withdrawal");
                                                            System.out
                                                                    .println("- Enter 3 to display transaction history");
                                                            System.out.println("- Enter 9 to return to previous list");
                                                            System.out.println("- Enter 0 to quit");
                                                            choice = in.nextInt();
                                                            switch (choice) {
                                                                case 1:
                                                                    System.out.print("Deposit amount: ");
                                                                    double deposit = in.nextDouble();
                                                                    selectedAccount.deposit(deposit);
                                                                    break;
                                                                case 2:
                                                                    System.out.print("Withdrawal amount: ");
                                                                    double withdrawal = in.nextDouble();
                                                                    selectedAccount.withdrawal(withdrawal);
                                                                    break;
                                                                case 3:
                                                                    selectedAccount.displayingTransactionsHistory();
                                                                    break;
                                                                case 9:
                                                                    break label2;
                                                                case 0:
                                                                    System.exit(0);
                                                                default:
                                                                    System.out.println("Invalid input");
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                }
                                                break;
                                            case 2:
                                                System.out.print("Starting balance: ");
                                                double balance = in.nextDouble();
                                                loggedUser.createAccount(balance);
                                                break;
                                            case 3:
                                                loggedUser.display();
                                                break;
                                            case 9:
                                                break label1;
                                            case 0:
                                                System.exit(0);
                                            default:
                                                System.out.println("Invalid input");
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice, try again.");
                }
            }

        }
    }
}
