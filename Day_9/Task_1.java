package Day_9;
//1.An e-commerce website allows customers to pay using different payment methods such as Credit Card, UPI, and PayPal. 
// Each payment method processes the payment differently.

// Question:
// Design an interface Payment with method processPayment(double amount).

// Create classes:

// CreditCardPayment

// UPIPayment

// PayPalPayment
interface Payment{
    void processPayment(double amount);
}
class CreditCardPayment implements Payment{

    
    public void processPayment(double amount){

        double Discount = amount - amount/10;
        System.out.println("Payment successfully done by Credit Card Payment 10% discount.. "+Discount);
    }
}
class UPIPayment implements Payment{

    public void processPayment(double amount){
        double Discount = amount - amount/100*5;
        System.out.println("Payment successfully done by UPI Payment 5% discount.. "+Discount);

    }
}

class PayPalPayment implements Payment{

    public void processPayment(double amount){

        double Discount = amount - amount/10*2;
        System.out.println("Payment successfully done by PayPal Payment 20% discount.. "+Discount);

    }
}

public class Task_1 {
    public static void main(String[] args) {
        
        Payment C = new CreditCardPayment();
        C.processPayment(500000);
        
        Payment U = new UPIPayment();
        U.processPayment(500000);

        
        Payment P = new PayPalPayment();
        P.processPayment(500000);

    }
}
