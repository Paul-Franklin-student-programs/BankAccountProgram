//this class is for effectuating deposits and withdrawals
//as well as setting and printing account information
public class BankAccount {
    String firstName;
    String lastName;
    int accountID;
    double balance;

    ///default constructor for class BankAccount
    public BankAccount() {
        this.balance = 0;
    }

    //specify deposit to make into user's account
    public void deposit(double deposit) {
        this.balance += deposit;}

    //specify withdrawal to make from user's account
    public void withdrawal(double withdrawal) {
        if ((this.balance - withdrawal)<0){
            System.out.println("Error: Negative balance not permitted.");}
        else{this.balance -= withdrawal;}
    }
    //set account owner's first name
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    //set account owner's last name
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    //set account owner's account ID
    public void setAccountID(int accountID){
        this.accountID = accountID;
    }

    //print account owner's first name
    public void getFirstName(){
        System.out.println("First Name: " + this.firstName);
    }

    //print account owner's last name
    public void getLastName(){
        System.out.println("Last Name: " + this.lastName);
    }

    //print account owner's account ID
    public void getAccountID(){
        System.out.println("Account ID: " + this.accountID);
    }

    //print account owner's balance
    public void getBalance() {
        System.out.println(String.format("Balance: $%.2f", this.balance));
    }

    //print summary of account information
    public void accountSummary() {
        System.out.println(String.format("Name: " + this.firstName + " " + this.lastName + "\nAccount ID: " + this.accountID +
                "\nBalance: $%.2f", this.balance));}
}

