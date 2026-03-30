package Exception;

public class Test {
  
    static int test() {
        try {
            System.out.println("Inside try block");
            return 10;
        } finally {
            System.out.println("Inside finally block");
            return 20;
        }
    }

    public static void main(String[] args) {
        int result = test();
        System.out.println("Returned value: " + result);
    }
}

