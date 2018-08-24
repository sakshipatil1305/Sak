import com.pojo.Employee;
import com.pojo.Person;

public class DemoPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person e = new Employee();
		((Employee)e).display(10);
		//Person p=new Person();
	}

}
// class DemoEmployee{	public Person printEmployee() {	return null;}}
//class Demochild extends DemoEmployee{
	//public Employee printEmployee() { return null;}
	//public void printEmployee(Person o) {}
	//public void printEmployee(Employee o) {}}