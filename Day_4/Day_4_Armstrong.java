    package Day4;

import java.util.Scanner;

public class Armstrong_number {
	
	public static void main(String []djgv) {
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Enter any number to find the given number is Armstrong number.");
		int  number = sc.nextInt();
		int i = 0;
		int mu = 0;
		double cube = 0; 
		int add = 0;
		
		if(number <=0 ) {
			System.out.println("Enter valid number.");
			
		}else {
		  i = String.valueOf(number).length();
		 }
		int duplicate = number;
		
		for(int p =i; p>0 ;p--){
			
			
			mu  = duplicate % 10;
			duplicate = duplicate / 10;
		   cube = Math.pow(mu, i);
		   add += (int)(cube);
		   
		}
		
		 if(number == add) {
			 

			 System.out.println("Armstrong number.");
		 
		 }else {
			 System.out.println(" not Armstrong number.");
		}
		 }
	
}

