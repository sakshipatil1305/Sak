package com.exception;

public class MyException extends Exception {
	private String message;

	public MyException() {
		message = "You got an exception";

	}

	public MyException(String message) {

		super(message);
		this.message = message;
	}

	public void showCause() {

		System.out.println("You got an exception");
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
		System.out.println("blah");
	}
}
