package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.beans.Book;
import com.connection.MyConnection;

public class JDBCfunctionalities implements BookDAO {

	@Override
	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
		String INSERT_BOOK = "insert into BOOK values(?,?,?,?)";
		int r = 0;

		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(INSERT_BOOK);
			ps.setString(1, book.getIsbn());
			ps.setString(2, book.getName());
			ps.setString(3, book.getPublication());
			ps.setString(4, book.getAuthor());
			r = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (r > 0) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public int updateBook(Book book, String ISBN) {
		// TODO Auto-generated method stub
		
		

		return 0;
	}

	@Override
	public int deleteBook(String ISBN) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Book findBookByISBN(String ISBN) throws SQLException {
		// TODO Auto-generated method stub
		Book book = new Book();
		String Find_by_ISBN = "select * from Book where ISBN=?";
		PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(Find_by_ISBN);
		ps.setString(1, ISBN);
		ResultSet set = ps.executeQuery();
		while (set.next()) {
			book = new Book(set.getString("ISBN"), set.getString("Name"), set.getString("Publication"),
					set.getString("Author"));
		}

		return book;

	}

	@Override
	public List<Book> findBookByName(String name) throws SQLException {
		// TODO Auto-generated method stub
		List<Book> book = new ArrayList<Book>();
		String Find_by_Name = "select * from Book where Name=?";
		PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(Find_by_Name);
		ps.setString(1, name);
		ResultSet set = ps.executeQuery();
		while (set.next()) {
			book.add(new Book(set.getString("ISBN"), set.getString("Name"), set.getString("Publication"),
					set.getString("Author")));

		}
		return book;
	}

	@Override
	public List<Book> findAllBooks() throws SQLException {
		// TODO Auto-generated method stub
		List<Book> book = new ArrayList<Book>();
		String Find_all = "select * from Book";
		Statement statement = MyConnection.getMyConnection().createStatement();
		ResultSet set = statement.executeQuery(Find_all);
		while (set.next()) {
			book.add(new Book(set.getString("ISBN"), set.getString("Name"), set.getString("Publication"),
					set.getString("Author")));

		}
		return book;
	}

	@Override
	public List<Book> findBooksByAuthor(String auth_name) throws SQLException {
		// TODO Auto-generated method stub
		List<Book> book = new ArrayList<Book>();
		String Find_by_Author = "select * from Book where Author=?";
		PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(Find_by_Author);
		ps.setString(1, auth_name);
		ResultSet set = ps.executeQuery();
		while (set.next()) {
			book.add(new Book(set.getString("ISBN"), set.getString("Name"), set.getString("Publication"),
					set.getString("Author")));

		}
		return book;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
