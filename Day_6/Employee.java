package Day_6;

public class Employee {
    int employeeId;
    String employeeName;

    
    Employee() {
        employeeId = 100;
        employeeName = "Not Assigned";
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();  // object created
        e1.display();
    }

}
