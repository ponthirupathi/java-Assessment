package Day_2;
class BankAccount {

    public static void main(String[]dg){
         BankAccount acc = new BankAccount(10000);
        acc.withdraw(2500);
    }

    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double withdrawAmount) {
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
