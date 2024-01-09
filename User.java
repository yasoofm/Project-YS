public class User {
    private String username;
    private String password;
    private BankAccount account;

    public User(String username, String password, BankAccount account) {
        this.username = username;
        this.password = password;
        this.account = account;
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

    public void setBankAccount(String account) {
        this.account = account;
    }
}
