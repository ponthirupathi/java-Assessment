package Exception;

import java.util.Scanner;

// Create a login system where:

// Invalid username → custom exception

// Invalid password → different exception

// After 3 failed attempts → terminate program.

class Invalid_username extends Exception {

    public Invalid_username(String msg) {
        super(msg);
    }
}

class Invalid_password extends Exception {

    public Invalid_password(String msg) {
        super(msg);
    }
}

class Login {

   void login(String user_name,String password)
    throws Invalid_username, Invalid_password
    {

    if(!user_name.equals("pon_@"))  {

        throw new Invalid_username("Invalid_username");
    }
        
    if(!password.equals("123@123" )){
        throw new Invalid_password("Invalid_password");
    }

    System.out.println("login Successfully...");
    }
}
class Login_Error{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Login l = new Login();

        int attempts = 0;

        while (attempts < 3) {
            try {
                System.out.print("Enter username: ");
                String user_name = sc.nextLine();

                System.out.print("Enter password: ");
                String password = sc.nextLine();

                l.login(user_name, password);
                break; 

            } catch (Invalid_username e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Invalid_password e) {
                System.out.println("Error: " + e.getMessage());
            }

            attempts++;
            System.out.println("Attempts left: " + (3 - attempts));
        }

        if (attempts == 3) {
            System.out.println("Too many failed attempts. Login terminated.");
        }
    }
}