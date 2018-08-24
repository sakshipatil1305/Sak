import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.beans.Book;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Book> books=new HashSet<>();
		books.add(new Book());
		books.add(new Book(123,"AdvJ","Oracle",2323d));
		books.add(new Book(223,"AdvJ","Oracle",2223d));
		books.add(new Book(123,"AdvJ","Oracle",2323d));
		System.out.println("size: "+books.size());
		
	Iterator<Book> it=books.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}
	
	
	
	

}
