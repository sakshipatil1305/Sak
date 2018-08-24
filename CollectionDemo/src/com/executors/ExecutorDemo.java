package com.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class myapp implements Runnable {
	public void run() {
		// TODO Auto-generated method stub
		perform();

	}

	void perform() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Hello\t" + i + "\t" + Thread.currentThread());
				Thread.sleep(100);
			} catch (InterruptedException ie) {
				// TODO Auto-generated catch block
				System.out.println(ie);
			}

		}
	}
}

public class ExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newFixedThreadPool(3);//newsinglethreadexecution
		for(int i=0;i<3;i++)
		{
			exec.execute(new myapp());
		}
		System.out.println("After submitting tasks:");
		System.out.println("After for loop");
		exec.execute(new myapp());
	

	
	/*
	 * shutdown() prevents new tasks from being submitted to that executor. The 
	 * current thread(eg: main thread ) will continue to run all tasks submitted 
	 * before  shutdown() was called
	 */

		exec.shutdown();//if u dont invoke then ivm will not shutdown
		System.out.println("done");
		//exec.execute(new myapp()); dont give any task after shutdown
	}
}
