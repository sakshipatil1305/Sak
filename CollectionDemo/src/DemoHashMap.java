import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.beans.Book;

public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> n = new HashMap<>();
		n.put("Citi", "Pune");
		n.put("Wipro", "Banglore");
		n.put("Oyo", "Gurgaon");

		System.out.println(n);
		n.put("Citi", "Mumbai");
		System.out.println(n);
		Set<Entry<String, String>> entries = n.entrySet();
		Iterator<Entry<String, String>> iterator = entries.iterator();
		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey() + "::" + entry.getValue());
			Map<String, Book> m = new HashMap<>();

			m.put("Citi", new Book());
			m.put("Wipro", new Book(2, "Sak", "fghj", 345));
			m.put("GS", new Book(1, "ak", "hj", 34));
			m.put("Ola", new Book(21, "S", "f", 3));

			System.out.println(m);
			Set<Entry<String, Book>> entries1 = m.entrySet();
			Iterator<Entry<String, Book>> it = entries1.iterator();
			while (it.hasNext()) {
				Entry<String, Book> entry1 = it.next();
				System.out.println(entry1.getKey() + "::" + entry1.getValue());

			}
			Map<String, List<Book>> m1 = new HashMap<>();
			List<Book> books_dotnet = new ArrayList<Book>();
			books_dotnet.add(new Book(1, "qw", "er", 12));
			books_dotnet.add(new Book(12, "qwew", "reer", 1122));
			books_dotnet.add(new Book(112, "asqw", "saer", 89));
			m1.put("DOT NET", books_dotnet);

			List<Book> books_java = new ArrayList<Book>();
			books_java.add(new Book(11, "aqw", "er", 12));
			books_java.add(new Book(212, "sqwew", "reer", 1122));
			books_java.add(new Book(3112, "qasqw", "saer", 89));
			m1.put("Java", books_java);
			System.out.println(m1);

			Set<Entry<String, List<Book>>> entries2 = m1.entrySet();
			Iterator<Entry<String, List<Book>>> it1 = entries2.iterator();
			while (it1.hasNext()) {
				Entry<String, List<Book>> entry2 = it1.next();
				System.out.println("Category: " + entry2.getKey());
				List<Book> books = entry2.getValue();
				for (Book book : books) {
					System.out.println(book.getBookname() + "---->" + book.getBookno());
				}

			}
		}
	}
}
