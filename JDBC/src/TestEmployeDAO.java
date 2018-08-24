import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.MyConnection;
import com.pojo.Employee;

public class TestEmployeDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee myEmployee = new Employee(90, "dada", 3535);
		EmployeeDAO dao = new EmployeeDAO();
		int rows = dao.addEmployee(myEmployee);
		if (rows > 0) {
			System.out.println("Record inserted sucessfully");
		} else
			System.out.println("Sorry");

	}

	
}
