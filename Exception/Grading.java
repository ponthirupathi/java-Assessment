package Exception;

import java.util.Scanner;

// .Implement a student grading system where:

// Invalid marks (<0 or >100) → exception

// Null student name → exception

// Use finally to print “Process Completed”
class Invalid_marks extends Exception {

    Invalid_marks(String msg) {
        super(msg);
    }
}

class Null extends Exception {

    public Null(String msg) {
        super(msg);
    }
}

 class Grading_mark {

    void grade(int mark, String Name) throws Invalid_marks, Null {
       
            if (mark < 0 || mark > 100) {
                throw new Invalid_marks("Error: Invalid Mark");
            }

            if (Name.equals("")) {
                throw new Null("Error: Null student name");
            }
            if (mark > 90) {
                System.out.println("GRADE: A+");
            } else if (mark > 80) {
                System.out.println("GRADE: A");
            } else if (mark > 70) {
                System.out.println("GRADE: B");
            } else if (mark > 60) {
                System.out.println("GRADE: C");
            } else if (mark > 50) {
                System.out.println("GRADE: D");
            } else if (mark >= 35) {
                System.out.println("GRADE: E");
            } else if (mark < 35) {
                System.out.println("Fail...");
            }
    }

}

public class Grading {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
          System.out.println("Enter your Name: ");
        String Name = sc.nextLine();

        System.out.println("Enter your mark");
        int mark = sc.nextInt();

       

        Grading_mark obj = new Grading_mark();
         try {
             obj.grade(mark, Name);
         } catch (Null e) {
            System.out.println("ERROR:" + e.getMessage());
        } catch (Invalid_marks e) {
            System.out.println("ERROR:" + e.getMessage());
        }
        finally {
            System.out.println("Process Completed");
        }
    }
    }
