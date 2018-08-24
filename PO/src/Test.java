import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import com.beans.Book;
import com.dao.JDBCfunctionalities;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException, SQLException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean condition = true;
		JDBCfunctionalities b = new JDBCfunctionalities();
		do {
			System.out.println("Menu");
			System.out.println("1 Add book");
			System.out.println("2 Update book");
			System.out.println("3 Display all books");
			System.out.println("4 Find books by name");
			System.out.println("5 Find Books by Author Name");
			System.out.println("6 Find books by ISBN");
			System.out.println("7 Exit");

			System.out.println("Choose from above: ");
			int choose = Integer.parseInt(br.readLine());

			switch (choose) {
			case 1:
				System.out.println("ISBN: ");
				String isbn = br.readLine();
				System.out.println("Name: ");
				String name = br.readLine();
				System.out.println("Publication: ");
				String publication = br.readLine();
				System.out.println("Author: ");
				String author = br.readLine();
				if (b.addBook(new Book(isbn, name, publication, author))) {
					System.out.println("Book added");
				} else {
					System.out.println("Book not added");
				}

				break;

			case 2:

				break;

			case 3:

				List<Book> list = b.findAllBooks();
				Iterator<Book> it = list.iterator();
				for (Iterator iterator = list.iterator(); iterator.hasNext();) {
					System.out.println(iterator.next());
				}
				break;

			case 4:
				String name1 = br.readLine();
				List<Book> list1 = b.findBookByName(name1);
				Iterator<Book> it1 = list1.iterator();
				for (Iterator iterator1 = list1.iterator(); iterator1.hasNext();) {
					System.out.println(iterator1.next());
				}

				break;

			case 5:
				String auth1 = br.readLine();
				List<Book> list2 = b.findBooksByAuthor(auth1);
				Iterator<Book> it2 = list2.iterator();
				for (Iterator iterator2 = list2.iterator(); iterator2.hasNext();) {
					System.out.println(iterator2.next());
				}

				break;

			case 6:
				String isbn1 = br.readLine();
				Book bb = b.findBookByISBN(isbn1);
				System.out.println(bb);

				break;

			case 7:
				System.out.println("BYE");
				condition=false;
				

				break;
			}
		} while (condition);
	}
}
