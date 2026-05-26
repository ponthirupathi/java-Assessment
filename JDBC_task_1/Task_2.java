package JDBC_task_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class Task_2 {

	static final String DB_URL = "jdbc:mysql://localhost:3306/java_class";
	static final String USER = "root";
	static final String PASS = "admin";
   public static void main(String[] args) {
       try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS)){
				PreparedStatement stmt = conn.prepareStatement("update student_mark set mark =? where id =?");

			
				stmt.setInt(1,60);
				stmt.setInt(3,4);
				
				int i = stmt.executeUpdate();
				System.out.println(i+"records inserted");

   }catch(Exception e){
       System.out.println(e);
   }
}
}

