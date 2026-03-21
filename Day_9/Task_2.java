package Day_9;

// Create an interface Vehicle with methods:

// startEngine()

// stopEngine()

// Implement the interface in the classes:

// Car

// Bike

// Truck
interface Vehicle{

    void startEngine();
    void stopEngine();
    
}

 class Car implements Vehicle{

    public void startEngine(){

        System.out.println("Car Engine Started...");
    }
    public void stopEngine(){
         System.out.println("Car Engine Stoped...");
    }
}

 class Bike implements Vehicle{

    
    public void startEngine(){

        System.out.println("Bike  Engine Started...");
    }
    public void stopEngine(){
         System.out.println("Bike Engine Stoped...");
    }
}

 class Truck implements Vehicle{

    
    public void startEngine(){

        System.out.println("Truck Engine Started...");
    }
    public void stopEngine(){
         System.out.println("Truck Engine Stoped...");
    }
}

public class Task_2 {

    public static void main(String[] args) {

    Vehicle C = new Car();
    C.startEngine();
    C.stopEngine();

    Vehicle B = new Bike();
    B.startEngine();
    B.stopEngine();

    Vehicle T = new Truck();
    T.startEngine();
    T.stopEngine();


    }    
}
