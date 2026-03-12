package Day_8;

// A system allows users to log in using different methods.

// Task:

// Create a class LoginSystem.

// Overload the method login() for:

// login(String username, String password)
 
// login(String email, String password)

// login(long mobileNumber, int otp)

// Demonstrate all login methods in the main() method.
class LoginSystem{

    // login(String username, String password)
    void login(String username, String password){

        if(username == "_pon_" && password == "784@430" ){
            System.out.println("Login with UserName and Password succssfully......");
        }else{
            System.out.println("you Email or OTP invalid enter valid Email or OTP.");
        }

    }

    // login(String email, String password)
     void login(String email, int otp){

        if(email == "ponkavi009@gmail.com" && otp == 883557 ){
            System.out.println("Login with Email and OTP succssfully......");
        }else{
            System.out.println("you username or password invalid enter valid username or password.");
        }

    }
    //login(long mobileNumber, int otp)
    void login(long mobileNumber, int otp){

        if(mobileNumber == 824827145 && otp == 12345678 ){
            System.out.println("Login with MobileNumber and OTP succssfully......");
        }else{
            System.out.println("you username or password invalid enter valid username or password.");
        }

    }
}



public class Login {

 
    public static void main(String[] args) {
        LoginSystem l = new LoginSystem();
        l.login("_pon_", "784@430");
        l.login("ponkavi009@gmail.com", 883557);
        l.login(824827145, 12345678);
    }
    
}
