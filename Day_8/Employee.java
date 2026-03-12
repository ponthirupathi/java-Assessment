package Day_8;
// A company provides different bonus calculations for Manager, Developer, and Intern.

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

// Task:

// Create a parent class Employee with a method calculateBonus().

// Create subclasses Manager, Developer, and Intern.

// Override the method in each class to display different bonus calculations.

// Demonstrate runtime polymorphism using a parent reference.
class Employees{

    void calculateBonus(int salary){

        if(salary >= 50000){
            int bonus = salary + 5000;
            System.out.println("your eligible for bonus...now your salary : "+salary);
        }else{
           System.out.println("your not eligible for bonus");
        }
    }
}
class Manager extends Employees {

     void calculateBonus(int salary){

        if(salary >= 55000){
            int bonus = salary + 10000;
            System.out.println("your eligible for bonus...now your salary : "+salary);
        }else{
           System.out.println("your not eligible for bonus");
        }
    }
    
}
class Developer extends Employees {

     void calculateBonus(int salary){

        if(salary >= 40000){
            int bonus = salary + 20000;
            System.out.println("your eligible for bonus...now your salary : "+salary);
        }else{
           System.out.println("your not eligible for bonus");
        }
    }
    
}
class Intern extends Employees {

     void calculateBonus(int salary){

        if(salary >= 10000){
            int bonus = salary + 2000;
            System.out.println("your eligible for bonus...now your salary : "+salary);
        }else{
           System.out.println("your not eligible for bonus");
        }
    }
    
}



public class Employee {
    
    public static void main(String[] args) {
        
        Employees e;
         e = new Manager();
         e.calculateBonus(70000);

         e= new Developer();
         e.calculateBonus(40000);

         e= new Intern();
         e.calculateBonus(8000);
    }

}
