package Exception;

import java.util.Scanner;

// Custom Exception 1
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

// Custom Exception 2
class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) {
        super(msg);
    }
}

class Bank {
    double balance = 1000;

    void withdraw(double amount) {
        try {
            if (amount < 0) {
                throw new InvalidAmountException("Amount cannot be negative");
            }

            if (amount > balance) {
                throw new InsufficientBalanceException("Not enough balance");
            }

            balance -= amount;
            System.out.println("Withdraw successful. Balance: " + balance);

        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Transaction logged...");
        }
    }
}

public class Bank_account{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        b.withdraw(amount);

      
    }
}