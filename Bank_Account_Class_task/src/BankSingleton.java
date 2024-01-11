import java.util.ArrayList;
import java.util.Scanner;

public class BankSingleton {
    private static ArrayList<BankAccount> accounts;
    private static BankSingleton instance;
    public static String usernameInput;
    Scanner scanner;

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

    public boolean authenticate() {
        scanner = new Scanner(System.in);
        String validPassword;
        int counter = 0;
        while (counter <= 2) {
            try {
                System.out.print("Username: ");
                usernameInput = scanner.nextLine();

                System.out.print("Password: ");
                String passwordInput = scanner.nextLine();
                for (User user : User.usersList) {
                    if (usernameInput.equals(user.getUsername())) {
                        validPassword = user.getPassword();
                        if (passwordInput.equals(validPassword)) {
                            System.out.println("You are successfully logged in");
                            return true;
                        } else if (counter < 2) {
                            counter++;
                            throw new Exception("Password is incorrect");
                        } else {
                            counter++;
                            throw new Exception("Maximum attempt reached, your account is blocked");
                        }
                    }
                }
                throw new Exception("Username does not exist, try again.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }

    public void closeScanner() {
        scanner.close();
    }
}
