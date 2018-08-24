package com.data;

public class Consumer implements Runnable {
	private Message msg;

	public Consumer(Message msg) {
		// TODO Auto-generated constructor stub
		this.msg = msg;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		synchronized (msg) {
			System.out.println(name+ " waiting to get notified at time"+  System.currentTimeMillis());
			msg.wait();
		}
		System.out.println(name+ " consumer thread get notified at time: "+System.currentTimeMillis());
		System.out.println(name+ " processes: "+msg.getMsg());
	}

}
