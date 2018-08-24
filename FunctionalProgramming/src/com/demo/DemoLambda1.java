package com.demo;

public class DemoLambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		MyInterface1 n=(x,y) -> {System.out.println("Addition: "+(x+y));};
//		n.add(21,32);
		MyInterface1 n=(p1,p2) -> {return p1.getAge()>10 && p2.getAge()>3;};
		System.out.println(n.add(new Person(2, "d"), new Person(5, "hj")));
		
		

	}

}
