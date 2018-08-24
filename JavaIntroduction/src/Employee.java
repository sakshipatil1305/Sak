
public class Employee {

	private int empId;
	private double salary;
	private String empName;
	private String CompanyName;
	
	public void display() {
		System.out.println("empID:-"+empId+"\t salary:="+salary+"\t empName:-"+empName+"\t CompanyName:-"+CompanyName);
		
	}
	public Employee() {
		
		// TODD auto generated constructor stub
		//this(12,"gdhs",2384724);
		empId=10;
		empName="citi";
		salary=23242;
		CompanyName="citi ltd";
	}
	
	public Employee(int empId,String empName,double salary) {
		this();
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		//this.CompanyName="citi ltd"
		
		
	}
	public static void main(String[] args) {
		Employee emp=new Employee(1299,"hjd",353343);
		emp.display();
		
	}

}
