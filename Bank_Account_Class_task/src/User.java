import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String username;
    private String password;
    private BankAccount account;
    public static ArrayList<String> usernames = new ArrayList<String>();
    private static ArrayList<String> passwords = new ArrayList<String>();
    public static ArrayList<User> usersList = new ArrayList<User>();
    public ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
    Scanner in = new Scanner(System.in);

    public User() {
        while (true) {
            try {
                System.out.print("Enter username: ");
                String username = in.nextLine();
                if (usernames.contains(username)) {
                    throw new Exception("The username already exists.");
                } else {
                    this.username = username;
                    usernames.add(username);
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.print("Enter password: ");
        String password = in.nextLine();
        this.password = password;
        passwords.add(password);
        usersList.add(this);
    }

    public void closeScanner() {
        in.close();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<BankAccount> getBankAccounts() {
        return accounts;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void createAccount(double balance) {
        account = new BankAccount(balance);
        accounts.add(account);
    }

    public void display() {
        System.out.println("Username: " + username);
        System.out.println("\t\tAccount\t\tBalance");
        for (BankAccount account : accounts) {
            System.out.println("\t\t" + account.getAccountNumber() + "\t\t" + account.getBalance());
        }
    }
}
