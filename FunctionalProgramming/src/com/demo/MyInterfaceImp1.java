package com.demo;

public class MyInterfaceImp1 implements MyInterface{

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		System.out.println("Showing data from implementation class");
		
	}
	public static void main(String[] args) {
		MyInterface n=new MyInterfaceImp1();
		n.showData();
	}

}