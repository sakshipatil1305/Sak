import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.beans.Book;

public class Test {

	public static void main(String[] args)

	{

		// TODO Auto-generated method stub
		DemoBookIO obj = new DemoBookIO();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int condition = 1;
		do {
			System.out.println("1 - Add; 2-Delete; 3-Find_By_ID; 4-Find_By_Name; 5-print");

			int choice = 0;
			try {
				choice = Integer.parseInt(br.readLine());
				if (choice == 1) {
					System.out.println(obj.addBook(obj.getBook()));
					System.out.println("Added");
				}
				if (choice == 2) {
					obj.deleteBook(obj.getBook());
					System.out.println("Removed");
				}
				if (choice == 3) {
					System.out.println("Enter isbn");
						int isbn = Integer.parseInt(br.readLine());
						Book book = new Book(isbn, null, null, 0);
						Book search = obj.findBookById(book);
						if (search.getBookno() == 0) {
							System.out.println("Not Found");
						} else {
							System.out.println("Found");
							obj.printBook(search);
						}
				}
				if (choice == 4) {
						System.out.println("Enter name");
							String name = br.readLine();
							List<Book> search1 = obj.findBooksByName(name);
							if (search1.size() > 0) {
								System.out.println("Found");
								obj.printBook(search1);
							}
							else {
								System.out.println("Not Found");

							}
					}
					if (choice == 5) {
						System.out.println("size in main:-" + obj.getBooks().size());
						obj.printBook(obj.getBooks());
						condition = 0;
					}

			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}while(condition!=0);

}}
