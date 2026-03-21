package Day_2;
class student {
	
	

    String name;        // Instance variable
    int rollNumber;     // Instance variable

    void calculateTotal(int m1, int m2, int m3) {

        int totalMarks = m1 + m2 + m3;   // Local variable

        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("-------------------");
    }
}

public class Student{
    
	public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Pon";
        s1.rollNumber = 101;

        s1.calculateTotal(80, 90, 85);
	}
    
}
