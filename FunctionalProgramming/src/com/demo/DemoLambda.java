package com.demo;

public class DemoLambda {
	public static void main(String[] args) {
		MyInterface m=() -> {System.out.println("Welcome to lambda");};	
		m.showData();
		
	}
}
