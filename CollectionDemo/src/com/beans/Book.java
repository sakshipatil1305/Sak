package com.beans;

import java.util.Comparator;

public class Book implements Comparable<Book>, Comparator<Book> {

	private int bookno;
	private String bookname;
	private String publication;
	private double price;

	public Book() {
		bookno = 112;
		bookname = "adad";
		publication = "ssds";
		price = 23232d;

	}

	public Book(int bookno, String bookname, String publication, double price) {
		this.bookname = bookname;
		this.bookno = bookno;
		this.price = price;
		this.publication = publication;

	}

	public int getBookno() {
		return bookno;
	}

	public void setBookno(int bookno) {
		this.bookno = bookno;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void display() {
		System.out.println("isbn:-" + bookno + "\t name:" + bookname + "pub: " + publication + "price: " + price);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		Book b = (Book) obj;
		return this.bookno == b.bookno && this.bookname == b.bookname;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return bookname.length();
	}

	@Override
	public String toString() {
		return "Book [bookno=" + bookno + ", bookname=" + bookname + ", publication=" + publication + ", price=" + price
				+ "]";
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub

		// return this.bookno-o.bookno;
		return this.bookname.compareTo(o.bookname);
	}

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
