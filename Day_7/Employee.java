package Day_7;
public class Employee {
    
    int empId;
    String empName;
    int salary;

Employee(int id, String name, int sal){
  
    empId=id;
    empName =name;
    salary = sal;


}

 public void displayEmployee(){

    System.out.println("Employee ID: "+empId);
    System.out.println("Employee NAME: "+empName);
    System.out.println("Employee SALARY: "+salary);
    System.out.println("-----------------------");
   
 }

 public static void main(String[] args) {
    
    Employee emp1 = new Employee(1001,"ponthirupathi",70000);
    emp1.displayEmployee();

     Employee emp2 = new Employee(1002,"mukhil",80000);
    emp2.displayEmployee();

     Employee emp3 = new Employee(1003,"kalai",60000);
    emp3.displayEmployee();
 }
}