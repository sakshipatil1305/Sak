package com.pojo;

import java.util.Scanner;

public class Circle extends Shape {
	
	public int radius;
	
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
	System.out.println("Enter radius");
	String r=s.next();
	
	radius=r;
	}
	
public Circle(String name, int dimensions, int radius) {
		super(name, dimensions);
		// TODO Auto-generated constructor stub
	}

}
}