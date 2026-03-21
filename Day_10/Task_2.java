package Day_10;
// Create an abstract class Food with an abstract method prepare().
// Implement subclasses Pizza and Burger that define their own preparation process.
abstract class Food{

    void preparation(int time){
        //only body;
    }
}

class Pizza extends Food{

    void preparation(int time){

        System.out.println("dear coustomer your pizza will prepare within "+time+" min..");
    }
}

class Burger extends Food{

    void preparation(int time){

        System.out.println("dear coustomer your Burger will prepare within "+time+" min..");
    }
}

public class Task_2 {
    
    public static void main(String[]bd){

        Food P = new Pizza();
        P.preparation(30);
        Food B = new Burger();
        B.preparation(20);
    }
}
