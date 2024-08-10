//this class adds user options to its BankAccount superclass
public class CheckingAccount extends BankAccount{
    double interestRate = 5.25;

    /*similar to withdrawal() but allows user to achieve a
    negative balance (for a fee) by withdrawing more money
    than their account currently contains*/
    public void processWithdrawal(double withdrawal){
        this.balance -= withdrawal;
        if (this.balance < 0){
            this.balance -= 30;
            System.out.println("Caution: You have a negative balance. A $30 overdraft fee has been applied. Current " +
                    "balance after withdrawal and fee application is " + String.format("$%.2f", this.balance));}
    }
    //displays all account information
    public void displayAccount(){
        System.out.println("Name: " + this.firstName + " " + this.lastName + "\nAccount ID: " + this.accountID +
                "\nBalance: " + this.balance + "\nInterest rate: " + interestRate);}


}

