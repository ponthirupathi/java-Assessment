package Day_10;
//Create an abstract class Account with an abstract method calculateInterest(). 
// Implement subclasses SavingsAccount and CurrentAccount.
abstract class Account {

    double balance;

    Account(double balance) {
        this.balance = balance;
    }
    abstract void calculateInterest();
}
class SavingsAccount extends Account {

    SavingsAccount(double balance) {
        super(balance);
    }

    void calculateInterest() {
        double interest = balance * 0.05; 
        System.out.println("Savings Account Interest: " + interest);
    }
}
class CurrentAccount extends Account {

    CurrentAccount(double balance) {
        super(balance);
    }

    void calculateInterest() {
        double interest = balance * 0.02; 
        System.out.println("Current Account Interest: " + interest);
    }
}
public class Task_4 {
     public static void main(String[] args) {

        Account acc1 = new SavingsAccount(10000);
        Account acc2 = new CurrentAccount(10000);

        acc1.calculateInterest();
        acc2.calculateInterest();
    }
}
