// Create a class BankAccount with:

// accountNumber

// accountHolderName

// balance

// Requirements:

// Initialize all fields using a parameterized constructor.

// Create a method deposit(double amount) to add money to balance.

// Create a method displayBalance() to show account details.

// In main, create one account object, deposit money, and print the updated balance.

package Day_7;

class Bank_Account {
    int accountNumber;

    String accountHolderName;

    int balance;

    double deposit;

    Bank_Account(int num, String name, int b) {

        this.accountNumber = num;
        this.accountHolderName = name;
        this.balance = b;
    }

    public void deposit(double amount) {

        deposit = amount + balance;
        System.out.println(amount + " Deposit Succssfully....");

    }

    public void displayBalance() {
        System.out.println("Account Holder NAME :" + accountHolderName);
        System.out.println("Account NUMBER :" + accountNumber);
        System.out.println("Account BALANCE :" + balance);
        System.out.println("After Deposited your current Balance :" + deposit);

    }

    public static void main(String[] args) {

        Bank_Account p1 = new Bank_Account(123456789, "ponthirupathi", 50000);
        p1.deposit(1000);
        p1.displayBalance();
    }
}