package Day_8;
// A Geometry Calculator should calculate the area of different shapes.

// Task:

// Create a class ShapeCalculator.

// Create multiple area() methods using method overloading for:

// Square (side)

// Rectangle (length, width)

// Circle (radius)

// Call all methods from the main() method.

class ShapeCalculator{

   // Square (side)
    void area(int side){

        int area = side * side ;
        System.out.println("Area of Square is : " +area);
    }
    // Rectangle (length, width)
    void area(int length, int width){

        int area = length * width ;
        System.out.println("Area of Rectangle is : " +area);
    }
    //Circle (radius)
    void area(double radius){
        double pi = 3.14;
        double area = pi*radius*radius;
        System.out.println("Area of Circle is : " +area);
    }



}

public class Shape {
    
    public static void main(String[] args) {
        ShapeCalculator s = new ShapeCalculator();
        s.area(6);
        s.area(7,9);
        s.area(7.0);
    }
}
