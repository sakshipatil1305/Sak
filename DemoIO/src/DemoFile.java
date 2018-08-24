import java.io.File;
import java.io.IOException;

public class DemoFile {
	
	public static void main(String[] args) {
		
		File myFile=new File("student.txt");
		try {
			myFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File Created Successfully");
		
	}

}
