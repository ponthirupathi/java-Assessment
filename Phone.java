//.A mobile shop creates a phone object with default values.

// Model → Samsung

// Price → 20000
public class Phone {
    String model;
    int price;

    Phone(String m, int p) {
        model = m;
        price = p;

    }

    void view() {
        System.out.println("phone model " + model);
        System.out.println("phone price " + price);

    }

    public static void main(String[]kjgdwfjhwfukwg){
        Phone p = new Phone("vivo_S21",29000);
        p.view();
    }
}
