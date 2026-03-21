package Day_2;

class Employee {

    public static void main(String[] args) {
        
        Employee emp = new Employee(1, 30000);
        emp.calculateSalary();
    }
    int empId;
    double basicSalary;

    Employee(int empId, double basicSalary) {
        this.empId = empId;
        this.basicSalary = basicSalary;
    }

    void calculateSalary() {
        double bonus = basicSalary * 0.10;
        double totalSalary = basicSalary + bonus;
        System.out.println("Employee ID: " + empId);
        System.out.println("Total Salary: " + totalSalary);
    }
}
