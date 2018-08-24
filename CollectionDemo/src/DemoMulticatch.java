import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoMulticatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fi=null;
		try {
			 fi=new FileInputStream("hello.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);
			oi.readObject();
		
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}}
