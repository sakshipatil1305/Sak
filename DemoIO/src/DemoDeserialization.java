import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.pojo.Student;

public class DemoDeserialization {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	try {
		FileInputStream fi=new FileInputStream("student.txt");
	ObjectInputStream oi= new ObjectInputStream(fi);
	Object obj=oi.readObject();
	Student stud=(Student)obj;
	System.out.println(stud.getName()+"\t"+stud.getTotal()+"\t"+stud.getRollNo());
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	}

}
