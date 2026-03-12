package Day_8;
// An E-commerce application supports multiple payment methods like Credit Card, Debit Card, and UPI.

// Task:

// Create a parent class Payment with a method processPayment().

// Create child classes CreditCardPayment, DebitCardPayment, and UPIPayment.

// Override the processPayment() method in each child class to display different payment messages.

// In the main() method, use parent reference and child objects to demonstrate runtime polymorphism.
class Payment {

    void processPayment() {
        System.out.println("payment Successfully done.");
    }
}
     class CreditCardPayment extends Payment {

        void processPayment() {
            System.out.println("payment Successfully done by CreditCard .");
        }

    }

    class DebitCardPayment extends Payment {

        void processPayment() {
            System.out.println("payment Successfully done by DebitCard .");
        }

    }

    class UPIPayment extends Payment {

        void processPayment() {
            System.out.println("payment Successfully done by UPIPayment.");
        }

    }
class main{
    public static void main(String[] args) {

        Payment p = new Payment();
        p.processPayment();

        CreditCardPayment c = new CreditCardPayment();
        c.processPayment();

        DebitCardPayment d = new DebitCardPayment();
        d.processPayment();

        UPIPayment u = new UPIPayment();
        u.processPayment();
    }
    }


