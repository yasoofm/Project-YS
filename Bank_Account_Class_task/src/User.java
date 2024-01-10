import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String username;
    private String password;
    private BankAccount account;
    private static ArrayList<String> usernames = new ArrayList<String>();
    private static ArrayList<String> passwords = new ArrayList<String>();

    public User() {
        Scanner in = new Scanner(System.in);
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
        in.close();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public BankAccount getBankAccount() {
        return account;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBankAccount(BankAccount account) {
        this.account = account;
    }

    public void createAccount() {
        account = new BankAccount(0);
    }

    public void display() {
        System.out.println("Username: " + username + "\n" + "Account number: " + account);
    }
}
