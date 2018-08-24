package com.pojo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student<Object> p;
		p= new Student<Object>();
		p.display();

	Scanner s=new Scanner(System.in);
	
	
	System.out.println("enter name: ");
	String name=s.next();
	System.out.println("number of subjects: ");
	int total=s.nextInt();
	int[] marks= new int[total];
	System.out.println("enter marks: ");
	for(int i=0;i<total;i++) { marks[i]=s.nextInt();}
	System.out.println("roll no:");
	int roll_no=s.nextInt();
	
	p=new Student<Object>(name,marks,roll_no);
	
	p.display();
	
	
}
}