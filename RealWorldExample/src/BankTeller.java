public class BankTeller extends Employee {
    int computer_number;

    public BankTeller(String name, int employeeID, int computer_number) {
        super(name, employeeID);
        this.computer_number = computer_number;
    }

    @Override
    public void deposit(double amount, Account account) {
        account.balance = account.balance + amount;
        System.out.println("Deposited " + amount + " to " + account.accountName);
        System.out.println("Balance: " + account.balance);
        System.out.println("Deposited on computer number: " + computer_number);

    }
}
