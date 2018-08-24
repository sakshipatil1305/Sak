import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.naming.ldap.Rdn;

public class DemoRead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Please enter number1: ");
			int number1=br.read();
		int s=br.read();
			System.out.println(number1);
			System.out.println("Please enter number2: ");
			int number2=br.read();
			
			if(number1==number2) {
		System.out.println("Both are equal");}
			
			else {System.out.println("Not Equal");}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
