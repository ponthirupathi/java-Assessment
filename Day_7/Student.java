package Day_7;
//  Student Grade System

// Create a class Student with:

// studentId

// studentName

// marks

// Requirements:

// Use a parameterized constructor to assign values.

// Create a method calculateGrade() using conditions:

// marks >= 90 → Grade A

// marks >= 75 → Grade B

// marks >= 50 → Grade C

// otherwise → Fail

// Create two student objects and display their grades.
public class Student {
    int studentId;
    String studentName;
    int marks;

    Student(int id, String name, int m) {
        this.studentId = id;
        this.studentName = name;
        this.marks = m;

    }

    public void calculateGrade() {

        System.out.println("Student NAME:" + studentName);
        System.out.println("Student ID:" + studentId);
        System.out.println("Student MARK:" + marks);
       

        if (marks >= 90) {
            System.out.println("GRADE A");
             System.out.println("-------------------");

        } else if (marks >= 75) {
            System.out.println("GRADE B");
             System.out.println("-------------------");
        } else if (marks >= 50) {
            System.out.println("GRADE C");
             System.out.println("-------------------");
        } else {

            System.out.println("Fail....bettr luck next time...");
             System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student(1001, "ponthirupathi", 80);
        s1.calculateGrade();

        Student s2 = new Student(1002, "Mukhil", 60);
        s2.calculateGrade();
    }

}
