public class Account {
    double balance;
    String accountName;
    boolean loan_approved;
    int pin;

    public Account(double balance, String accountName, boolean loan_approved, int pin) {
        this.balance = balance;
        this.accountName = accountName;
        this.loan_approved = loan_approved;
        this.pin = pin;
    }
}
