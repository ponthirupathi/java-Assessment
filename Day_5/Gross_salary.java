package Day_5;
//Instance variables: empId, empName, basicSalary
//
//Method to calculate:
//
//HRA = 20% of basic
//
//DA = 10% of basic
//
//Gross Salary = basic + HRA + DA
//
//Create 3 employee objects and display their gross salary.
//
//👉 Add a condition: If basic salary > 50000, give 5% bonus.



import java.util.Scanner;

public class Gross_salary {
	
	Scanner sc = new Scanner(System.in); 
	
	
	int empId ;
	String empName;
	int basicSalary;
	
	
	
	
     public void method() {
    	 
    	 System.out.println("Employ name:"+empName);
    	 System.out.println("Employ ID:"+empId);
    	 System.out.println("Employ basic_Salary:"+basicSalary);
    	 System.out.println("");
    	 
    	 
    	 int HRA =  basicSalary / 10 * 2;
    	 
    	 int DA = basicSalary / 10 ;
    	 
    	 int  Gross_Salary = HRA + DA + basicSalary;
    	 
    	 System.out.println("your HRA Salary is : "+HRA);
    	 System.out.println("your DA Salary is : "+DA);
    	 
    		
    		 if( basicSalary > 50000) {
        		 
        		 int temp =  Gross_Salary ;
        		 
        		  int sum = temp / 100;
        		  
        		  int result = sum*5;
        		  
        		  result +=  Gross_Salary ;
        		  
        		  System.out.println("your Gross_Salary  Salary is : "+result);
        		  
    	 }else {
    		 System.out.println("your Gross_Salary  Salary is : "+Gross_Salary);
    	 }
    		 
    	 }
    	 
    	 
    	 
    	 public static void main(String[]shgf) {
    		 
    		 Gross_salary emp1 = new Gross_salary();
    		 emp1.empId =100;
    		 emp1.empName  ="ponthirupathi";
    		 emp1.basicSalary = 50000;
    		 emp1.method();
    		 
    		 Gross_salary emp2 = new Gross_salary();
    		 emp2.empId =101;
    		 emp2.empName  ="mukhil";
    		 emp2.basicSalary = 55000;
    		 emp2.method();
    		 
    		 Gross_salary emp3 = new Gross_salary();
    		 emp3.empId =103;
    		 emp3.empName  ="sasi";
    		 emp3.basicSalary = 40000;
    		 emp3.method();
    		 
    		 
     }
}


