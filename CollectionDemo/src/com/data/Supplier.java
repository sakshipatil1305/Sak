package com.data;

public class Supplier implements Runnable {

	private Message msg;

	public Supplier(Message msg) {
		// TODO Auto-generated constructor stub
		this.msg = msg;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name= Thread.currentThread().getName();
		System.out.println(name+ " started");
		
		Thread.sleep(2000);
		synchronized ( msg) {
       msg.setMsg		
		}

	}

}
