package JDBC_task_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class Task_3 {

		static final String DB_URL = "jdbc:mysql://localhost:3306/class";
		static final String USER = "root";
		static final String PASS = "admin";
	   public static void main(String[] args) {
	       try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS)){
					PreparedStatement stmt = conn.prepareStatement
							("update employees e join department d on e.dept_id = d.dept_id set salary =? where d.dept_id=?");

				
					stmt.setInt(1,60000);
					stmt.setInt(2,4);
					int i = stmt.executeUpdate();
					System.out.println(i+"records inserted");

	   }catch(Exception e){
	       System.out.println(e);
	   }
	

}

}
