package com.pojo;

import java.util.Scanner;

public class Shape {
	
	
	String name;
int dimensions;
	
	public Shape(String name, int dimensions) {
		// TODO Auto-generated constructor stub
		
		this.name=name;
		this.dimensions=dimensions;
	}

	public static void main(String[] args) {
		
		
	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Shape type");
		String n=s.next();
		System.out.println("no. of dimensions");
		int d=s.nextInt();
		
		Shape s1= new Shape(n,d);

}}