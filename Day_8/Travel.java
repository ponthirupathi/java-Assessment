package Day_8;
//  Transport Fare System (Runtime Polymorphism)
// A travel booking system calculates fare differently for different vehicles.

// Task:

// Create a parent class Transport with a method calculateFare().

// Create child classes Bus, Train, and Taxi.

// Override the method in each class to display different fare calculations.

// Use runtime polymorphism to call the methods.
class Transport {

    void calculateFare() {
        System.out.println("Calculating transport fare...");
    }
}

class Bus extends Transport {

    void calculateFare() {
        System.out.println("Bus fare: Rs.10 per km");
    }
}

class Train extends Transport {

    void calculateFare() {
        System.out.println("Train fare: Rs.5 per km");
    }
}

class Taxi extends Transport {

    void calculateFare() {
        System.out.println("Taxi fare: Rs.15 per km");
    }
}

class Travel{
    public static void main(String[] args) {

        Transport t;

        t = new Bus();
        t.calculateFare();

        t = new Train();
        t.calculateFare();

        t = new Taxi();
        t.calculateFare();
    }

}
