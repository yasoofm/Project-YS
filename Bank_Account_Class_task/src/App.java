public class App {
    public static void main(String[] args) throws Exception {

        BankSingleton bankSingleton = BankSingleton.getInstance();

        User yousef = new User();
        User saleh = new User();
        User ali = new User();

        bankSingleton.authenticate();
        yousef.closeScanner();
        saleh.closeScanner();
        ali.closeScanner();
    }
}
