import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.connection.MyConnection;

public class DemoTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyConnection connection = new MyConnection();
		Connection con = null;
		con = connection.getMyConnection();

		Statement statement;
		try {
			statement = con.createStatement();
			statement.executeUpdate("Insert into employee1 values(992,'sds','65789')");
			con.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}
