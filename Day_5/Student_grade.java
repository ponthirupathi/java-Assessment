package Day_5;

public class Student_grade {

	int roll_number;
	String name;
	
	
	public void calculate(int m1,int m2, int m3) {
		
		System.out.println("Student Name:"+name);
		System.out.println("Student Roll_number:"+roll_number);
		
		int total = m1+m2+m3;
		
		int average = total/3 ;
		
		System.out.println("your total mark :"+total);
		System.out.println("your Average mark is :"+average);
		
		if(average >= 80) {
			
			System.out.println("you get A Grade");
			System.out.println("---------------------");
		}else if(average >= 60) {
			
			System.out.println("you get B Grade");
			System.out.println("---------------------");
		}else if(average >= 40) {
			
			System.out.println("you get B Grade");
			System.out.println("---------------------");
		}else {
			System.out.println("fail better luck next time");
			System.out.println("---------------------");
		}
		
	}
	public static void main(String []gfc) {
		
		Student_grade s1 = new Student_grade();
		s1.name = "ponthirupathi"; 
		s1.roll_number = 100; 
		s1.calculate(100,100,100);
		
		Student_grade s2 = new Student_grade();
		s2.name = "Alan"; 
		s2.roll_number = 101; 
		s2.calculate(67,78,100);
		
		Student_grade s3 = new Student_grade();
		s3.name = "mukhil"; 
		s3.roll_number = 103; 
		s3.calculate(59,90,85);
		
		Student_grade s4 = new Student_grade();
		s4.name = "karnan"; 
		s4.roll_number = 104; 
		s4.calculate(20,10,7);
		
		Student_grade s5 = new Student_grade();
		s5.name = "Sasi"; 
		s5.roll_number = 100; 
		s5.calculate(57,67,77);
		
	}
}
