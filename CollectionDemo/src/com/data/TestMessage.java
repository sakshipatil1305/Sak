package com.data;

public class TestMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message msg = new Message("process it");
		Consumer waiter = new Consumer(msg);
		new Thread(waiter, "consumer 1").start();
		Supplier waiter1 = new Supplier(msg);
		new Thread(waiter, "Supplier 1").start();
		System.out.println("All the threads are started");

	}

}
