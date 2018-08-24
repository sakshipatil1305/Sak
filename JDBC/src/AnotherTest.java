import java.util.List;

import com.pojo.Employee;

public class AnotherTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO dao=new EmployeeDAO();
		List<Employee> emp= dao.findAllEmployee();
		System.out.println(" ");
		for(Employee employee: emp)
		{
			System.out.println(employee.getName());
		}

	}

}
