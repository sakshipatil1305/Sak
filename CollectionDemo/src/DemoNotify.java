
public class DemoNotify extends Thread {
	int sum=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			sum=sum+i;
		}
	}

}
