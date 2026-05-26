package JDBC_Task_2;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Task_1 {

    static final String DB_URL = "jdbc:mysql://localhost:3306/java_class";
	    static final String USER = "root";
	    static final String PASS = "admin";
	    
	    public static void main(String[] args) {
	        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

	            CallableStatement cs = conn.prepareCall("{call insert_student_data(?,?,?)}");
	            
	            cs.setString(1,"gokul");
	            cs.setInt(2,7);
	            cs.setInt(3, 98);
	            cs.execute();
	            
	            System.out.println("successfully inseted student data");

}catch(Exception e) {
	System.out.println(e);
}    
	        
}

}
