package com.pojo;

public class Student<marks> {
	String name;
	int[] marks;
	int roll_no;
	
	public void display() {
		System.out.println(name+"\t"+roll_no);
		for(int i=0;i<marks.length;i++) {System.out.println(marks[i]);}
		
	}

public Student() {
	name="sakshi";
	marks= new int[]{78,98,87};
	roll_no=34;
	
}

public Student(String names, int[] score,int rollno) {
	this.name=names;
	this.marks=score;
	this.roll_no=rollno;
	
} 




}
