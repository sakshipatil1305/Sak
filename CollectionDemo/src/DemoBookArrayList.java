import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.beans.Book;

public class DemoBookArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Book> books= new ArrayList<Book>();
		books.add(new Book());
		books.add(new Book(123,"AdvJ","Oracle",2323d));
		books.add(new Book(223,"AdvJ","Oracle",2223d));
		books.add(new Book(123,"AdvJ","Oracle",2323d));
		
		books.stream().filter(data -> {
			return data.getPrice() > 2230;
		}).collect(Collectors.toList()).forEach(System.out::println);
	}}
		
		
		
		
		
//		System.out.println("no of books: " +books.size());
//		System.out.print(books);
//		
//		
//		Book book_to_search=new Book(123,"AdvJ","Oracle",2323d);
//		boolean found=books.contains(book_to_search);
//		
//		boolean removed=books.remove(book_to_search);
//		System.out.println("removed: "+removed);
//		
//		if(found) {
//			System.out.println("FOund");
//			
//		}
//		else {
//			System.out.println("nope");
//		}
//		
//	}

