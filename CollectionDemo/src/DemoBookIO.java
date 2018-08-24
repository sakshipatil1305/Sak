import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.beans.Book;
import com.interfaces.BookIO;
import com.interfaces.BookOperations;

public class DemoBookIO implements BookIO, BookOperations {

	// TODO Auto-generated method stub
	List<Book> books = new ArrayList<Book>();
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		if (books.add(book)) {
			System.out.println("size:-"+books.size());
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public boolean deleteBook(Book book) {
		// TODO Auto-generated method stub
		boolean isRemoved = books.remove(book);
		if (isRemoved) {
			return true;
		}
		return false;

	}

	@Override
	public Book findBookById(Book book) {
		// TODO Auto-generated method stub
		Iterator<Book> iterator = books.iterator();

		while (iterator.hasNext()) {
			Book b = iterator.next();
			if (b.getBookno() == book.getBookno()) {
				return b;
			}
		}
		return new Book();
	}

	@Override
	public List<Book> findBooksByName(String book_name) {
		// TODO Auto-generated method stub
		Iterator<Book> iterator = books.iterator();
		List<Book> l = new ArrayList<Book>();
		while (iterator.hasNext()) {
			Book b = iterator.next();
			if (b.getBookname() == book_name) {

				l.add(b);
			}

		}
		return l;

	}

	@Override
	public Book getBook() {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter book name");
		String name = null;
		try {
			name = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter isbn");
		int isbn = 0;
		try {
			isbn = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter pub");
		String pub = null;
		try {
			pub = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter salary");
		int salary = 0;
		try {
			salary = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Book book = new Book(isbn, name, pub, salary);
		return book;
	}

	@Override
	public void printBook(List<Book> books) {
		// TODO Auto-generated method stub
		Iterator<Book> it = books.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	@Override
	public void printBook(Book book) {
		// TODO Auto-generated method stub
		System.out.println(book);
	}

}
