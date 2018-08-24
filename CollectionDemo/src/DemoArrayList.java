import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l= new ArrayList();
		l.add("ABC");
		l.add("XYZ");
		l.add("A");
		l.add("A");
		l.add(2, "new");
		//l.add(new Object());
		//l.add(new File("data.txt"));
		
		System.out.println(l);
		int size=l.size();
		System.out.println("size: "+size);
		boolean found=l.contains(0); 
		if(found) {
			System.out.println("found");
		}
		else
		{System.out.println("sorry");}
	
		Object o=l.get(2);
		System.out.println("your data is: "+o);
		o=l.remove(2);
		Object o1=l.remove("A");
		System.out.println(l+" you removed: "+o);
		
		Iterator<String> it = l.iterator();
		while(it.hasNext())
		{
			String data=it.next();
			System.out.println(data);
		}
	}
}