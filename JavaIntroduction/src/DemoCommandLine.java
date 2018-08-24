
public class DemoCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("num of arg = " +args.length);
		System.out.println("argument:-"+args[0]);
	
	int a= Integer.parseInt(args[0]);
	int b= Integer.parseInt(args[1]);
	int c= Integer.parseInt(args[2]);
	
	int sum= a+b+c;
	
	for(String arg:args)
		{
		sum=sum+Integer.parseInt(arg);
		}
	
	System.out.println(+sum);
	
	}
	
}


