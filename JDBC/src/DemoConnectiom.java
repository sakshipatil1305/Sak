import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoConnectiom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CITI","sa" , "sa123");
			System.out.println("Connection Successful");
			String INSERT_EMPLOYEE1="insert into employee1 values(3,'CITI',10000)";
			Statement statement=con.createStatement();
			int rows=statement.executeUpdate(INSERT_EMPLOYEE1);
			System.out.println("rows inserted: "+rows);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
