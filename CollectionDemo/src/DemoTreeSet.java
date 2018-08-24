import java.util.Set;
import java.util.TreeSet;

import com.beans.Book;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Book> books= new TreeSet<>(new MyComparator());
		books.add(new Book());
		books.add(new Book(123,"A","Oracle",23d));
		books.add(new Book(223,"Z","Oracle",50d));
		books.add(new Book(123,"C","Oracle",1d));
		System.out.println("size: "+books.size());
		System.out.println(books);
	}

}
