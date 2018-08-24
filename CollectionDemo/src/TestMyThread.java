
public class TestMyThread {
	public static void main(String[] args) {

		System.out.println("Main Started: "+Thread.currentThread().getName());
		Thread t = new MyThread(12);
		t.setName("QWERTY");
		t.start();
		
		Thread t1 = new MyThread(5);
		t1.setName("YTREWQ");
		t1.start();
		System.out.println("Main completed: "+Thread.currentThread().getName());
	}
}
