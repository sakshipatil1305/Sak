import java.util.Scanner;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String name=s.next();
		System.out.println("Initial value of name: "+name);
		String name1="Sakshi";
		if(name.equals(name1))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Unequal");
		}
		name=name.concat(",Analyst");
		System.out.println("After concantation value of name: "+name);
		if(name.startsWith("S"))
		{
			System.out.println("The name starts with S");
		}
		
		else
		{System.out.println("It doesnt start with S");}
		if(name.endsWith("t"))
		{
			System.out.println("true");
		}
		else
		{System.out.println("false");}
	
	String sub_string=name.substring(5);
			System.out.println("Substring   "+sub_string);
	
	char p= name.charAt(0);
	System.out.println(+p);
	
	
	
	
	}	
	
}
