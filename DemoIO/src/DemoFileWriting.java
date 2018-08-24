import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter filew=new FileWriter("abc.txt");
			filew.write("Blah Blah Blah");
			filew.close();
			System.out.println("File created and data inserted");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
