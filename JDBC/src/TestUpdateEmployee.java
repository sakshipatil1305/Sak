import com.pojo.Employee;

public class TestUpdateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int id_update=12;
		Employee emp1=new Employee(1,"CITI",10000);
		
		EmployeeDAO dao1=new EmployeeDAO();
		Employee emp1_updated=dao1.updateEmployee(id_update, emp1);
		System.out.println(emp1_updated.getName()+"::" + emp1_updated.getSalary()+"::"+emp1_updated.getEmpid());
				}

}
