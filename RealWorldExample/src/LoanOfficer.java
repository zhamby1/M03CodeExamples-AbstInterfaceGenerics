public class LoanOfficer extends Employee {
    int loanOfficerID;

    public LoanOfficer(String name, int employeeID, int loanOfficerID) {
        super(name, employeeID);
        this.loanOfficerID = loanOfficerID;
    }

    @Override
    public void deposit(double amount, Account account) {
        if(account.loan_approved){
            account.balance = account.balance + amount;
            System.out.println("Your loan is approved!  Depositing: " + amount);
            System.out.println("Your balance is " + account.balance);
            System.out.println("Your loan was approved by officer number: " + loanOfficerID);

        }
        else{
            System.out.println("Your loan is not approved");
            return;
        }
    }
}
