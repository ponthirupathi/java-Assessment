package JDBC_task_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Task_1 {
  

	static final String DB_URL = "jdbc:mysql://localhost:3306/java_class";
	static final String USER = "root";
	static final String PASS = "admin";
   public static void main(String[] args) {
       try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS)){
				PreparedStatement stmt = conn.prepareStatement("insert into student_mark values(?,?,?)");



				int count = 0;

				stmt.setString(1,"pon");
				stmt.setInt(2,2);
				stmt.setInt(3,78);
				count += stmt.executeUpdate();

				stmt.setString(1,"Alan");
				stmt.setInt(2,3);
				stmt.setInt(3,59);
				count += stmt.executeUpdate();

				System.out.println(count + " records inserted");

   }catch(Exception e){
       System.out.println(e);
   }
}
}
