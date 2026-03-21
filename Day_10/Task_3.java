package Day_10;

// Design an abstract class Transport with an abstract method bookTicket().
// Implement subclasses Bus and Train.


abstract class Transport{
    void bookTicket(int amount){

    }
}

class Bus extends Transport{

    void bookTicket(int amount){

        System.out.println("per head Bus fair is :"+amount);
    }
}

class Train extends Transport{

    void bookTicket(int amount){

        System.out.println("per head Train ticket is :"+amount);
    }
}

public class Task_3 {

    public static void main(String[]d){

    
    Transport B = new Bus();
    B. bookTicket(10);

    Transport T = new Train();
    T.bookTicket(5);



    }
}
