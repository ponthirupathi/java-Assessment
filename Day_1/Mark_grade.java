package javaProgram;
import java.util.Scanner;

public class Mark_grade {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your mark:");
		int mark = sc.nextInt();
		
		condition(mark);   
	}
	
	public static void condition(int mark) {
		
		if(mark < 0 || mark > 100) {
			System.out.println("Enter valid mark.");
			
		} else if(mark >= 90) {
			System.out.println("Grade A+");
			
		} else if(mark >= 70) {
			System.out.println("Grade A");
			
		} else if(mark >= 50) {
			System.out.println("Grade B");
			
		} else if(mark >= 35) {
			System.out.println("Grade C");
			
		} else {
			System.out.println("Fail Better luck next time.");
		}
	}
}
