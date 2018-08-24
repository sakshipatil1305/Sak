import java.util.Scanner;

import com.pojo.Employee;

public class EmployeeIOImpl implements EmployeeIO {

	@Override
	public Employee readEmployee() {
		// TODO Auto-generated method stub
		Scanner emp= new Scanner(System.in);
		System.out.println("Enter name");
		String name= emp.next();
		System.out.println("Enter age");
		int age= emp.nextInt();
		
		System.out.println("Enter ID");
		int empId= emp.nextInt();
		System.out.println("Enter Salary");
		int salary= emp.nextInt();
		Employee emp1 = new Employee(empId,salary,age,name);
		
		return emp1;
	}

	@Override
	public void writeEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("name: "+employee.getName());
		System.out.println("name: "+employee.getEmpId());
		System.out.println("name: "+employee.getAge());
		System.out.println("name: "+employee.getEmpSalary());
	}

}
