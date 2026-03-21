package Day_10;
//Design an abstract class Appliance with an abstract method turnOn() and turnOff().
//Implement the methods in Fan and WashingMachine classes.
abstract class Method{
    void turnOn(){}

    void turnOff(){}
}

class Fan extends Method{

    void turnOn(){
        System.out.println("Now Fan trun on ...");
    }

    void turnOff(){
        System.out.println("Now Fan trun off ...");
    }
}

class WashingMachine extends Method{
   
        void turnOn(){
        System.out.println("Now WashingMachine trun on ...");
    }

    void turnOff(){
        System.out.println("Now WashingMachine trun off ...");
    }
}


public class Task_1 {
    

    public static void main (String[]jhgfd){

        Fan F = new Fan();
        F.turnOff();
        F.turnOn();

        Method M = new WashingMachine();
        M.turnOff();
        M.turnOn();
    }
}
