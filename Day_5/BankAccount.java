
package Day5;

public class BankAccount {

	int  accountNumber;
	String accountHolderName;
	int balance;
	
	
	public void  deposit(int amount) {
		
		
		balance += amount;
		
		System.out.println("you are deposit successfully completed...");
		
		System.out.println("now your current balance is :"+balance);
		
	}
	
	public void withdraw(int amount) {
		if(amount < balance) {
		balance -= amount;
		
		System.out.println("you are  withdraw was successfully completed...");
		
		System.out.println("now your current balance is :"+balance);
        		
	}else {
		System.out.println(" insufficient balance.");
	}
	}
		
	
	public  void main(String [] hgy) {
		
		
		BankAccount customer1 = new BankAccount();
		customer1.accountNumber = 123456789;
		customer1.accountHolderName = "Vasi";
		customer1.balance = 50000;
		withdraw(23456);
	}
	
	
	
}

