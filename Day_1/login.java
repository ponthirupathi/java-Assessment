package Day_1;
import java.util.Scanner;

public class login {
	
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter u r username & password...");
			
			System.out.println("username : Admin");
			System.out.println("password : Admin@123");
			System.out.println("");
			System.out.println("");
			
			System.out.println("enter username:");
			String username = sc.next();
			
			System.out.println("enter password:");
			String password = sc.next();
			
			condition(username , password);
			
			
		  
		}
		public static void condition(String username ,String password) {
			
			 String temp_username = username;
			 String temp_password = password;
			 
			
			if(temp_username.equals("Admin") && temp_password.equals("Admin@123") ) {
				
				System.out.println("welcome....");
				
			}else {
				System.out.println("Enter valid username or password.");
			}
		}
			
			
		
		

}
 
