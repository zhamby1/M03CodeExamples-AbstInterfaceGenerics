//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(500.00,"ZachHamby",true,123);
        Account account2 = new Account(1000.00,"TimSmith",false,456);
        Customer zachHamby = new Customer("Zach Hamby",account1,123);
        Customer timSmith = new Customer("Tim Smith",account2,123);
        BankTeller tellerJim = new BankTeller("Jim",46546,1);
        LoanOfficer sherryOfficer = new LoanOfficer("Sherry",4646568,123);

        sherryOfficer.deposit(5000.00,account1);
        sherryOfficer.deposit(5000.00,account2);

        tellerJim.deposit(400.00,account1);
        zachHamby.deposit(500.00,account1);
        timSmith.deposit(500.00,account2);



    }
}