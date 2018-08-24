
public class Demo1DObjects

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person[] persons;
		persons = new Person[5];
		persons[0] = new Person();
		persons[1] = new Person(22, "d");
		persons[2] = new Person(34, "sf");
		persons[3] = new Person(004, "ds");
		persons[4] = new Person(4, "s");

		for (Person x: persons) 
		{
			x.display();
			
		}
	}

}
