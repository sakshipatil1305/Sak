import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.MyConnection;
import com.pojo.Employee;

public class EmployeeDAO {

	public int addEmployee(Employee emp) {

		String INSERT_EMPLOYEE = "insert into employee1 values(?,?,?)";
		int r = 0;
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(INSERT_EMPLOYEE);
			ps.setInt(1, emp.getEmpid());
			ps.setString(2, emp.getName());
			ps.setInt(3, emp.getSalary());
			r = ps.executeUpdate();
			return r;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}

	public List<Employee> findAllEmployee() {

		List<Employee> employee = new ArrayList();
		Connection con = MyConnection.getMyConnection();
		String Find_All_EMPLOYEE1 = "select * from employee1";
		try {
			Statement statement = con.createStatement();
			ResultSet set = statement.executeQuery(Find_All_EMPLOYEE1);
			while (set.next()) {
				int empid = set.getInt(1);
				String name = set.getString(2);
				int salary = set.getInt(3);
				Employee emp = new Employee(empid, name, salary);
				employee.add(emp);
				System.out.println(empid + " " + name + " " + salary);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;

	}

	public Employee updateEmployee(int empid, Employee employee) {
		Employee emp = new Employee();
		String UPDATE_EMPLOYEE = "update employee1 set salary=? where empid=?";
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(UPDATE_EMPLOYEE);
			ps.setInt(1, employee.getSalary());
			ps.setInt(2, empid);

			int row = ps.executeUpdate();
			if (row > 0) {
				emp = employee;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return emp;

	}
	public Employee findEmployeeId(int empid) throws SQLException
	
	{
		Employee emp= new Employee();
		String Find_by_ID="select * from employee where emppid=?"
			;
		PreparedStatement ps=MyConnection.getMyConnection().prepareStatement(Find_by_ID)
;
		
	ps.setInt(1, empid);
	ResultSet set= ps.executeQuery();
	while(set.next())
		{
		emp=new Employee(set.getInt("empid"),set.getString("name"),set.getInt("salary"));
		
		}
	return emp;}
}
