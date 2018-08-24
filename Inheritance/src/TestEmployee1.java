import java.io.InputStream;
import java.util.Scanner;
import com.pojo.Employee;
import com.pojo.Person;
public class TestEmployee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//*Scanner emp=new Scanner(System.in);
		//*System.out.println("enter name ");
		//*String name=emp.next();
		//System.out.println("enter age ");
		//int age=emp.nextInt();
		//System.out.println("enter empId ");
		//int empId=emp.nextInt();
		//System.out.println("enter salary ");
		//int salary=emp.nextInt();
		
		//Employee s=new Employee(empId,salary,age,name);
		//s.display(); 
		
		Employee p1= new Employee(65,876,12,"ds");
		Employee p2= new Employee(65,876,12,"ds");
		
		if(p1.equals(p2))
		{
			System.out.println("Equal");
			
		}
		else {
			System.out.println("Not Equal");
		}
	
	}

	}
