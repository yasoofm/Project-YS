public class User {
    private String username;
    private String password;
    private BankAccount account;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
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
