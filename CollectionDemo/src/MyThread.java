
public class MyThread extends Thread {
	
	int data;
	public MyThread() {
		// TODO Auto-generated constructor stub
		data=2;
	}
	
	public MyThread(int data) {
		// TODO Auto-generated constructor stub
		this.data=data;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println(Thread.currentThread().getName());
	}
}
