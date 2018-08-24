package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.beans.Book;

public interface BookDAO {
	
	boolean addBook(Book book);
	int updateBook(Book book,String ISBN);
	int deleteBook(String ISBN);
	Book findBookByISBN(String ISBN) throws SQLException;
	List<Book> findBookByName(String name) throws SQLException;
	List<Book> findAllBooks() throws SQLException;
	List<Book> findBooksByAuthor(String auth_name) throws SQLException;
	

}
