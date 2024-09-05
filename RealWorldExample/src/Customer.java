public class Customer implements canDeposit{
    String name;
    Account customerAccount;
    int pin;

    public Customer(String name, Account customerAccount, int pin) {
        this.name = name;
        this.customerAccount = customerAccount;
        this.pin = pin;
    }

    @Override
    public void deposit(double amount, Account account) {
        if(pin == customerAccount.pin){
            account.balance += amount;
            System.out.println("Deposited to ATM: " + amount);
            System.out.println("New Balance: " + account.balance);

        }
        else {
            System.out.println("Error wrong pin");
            return;
        }

    }
}
