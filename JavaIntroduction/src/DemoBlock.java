
public class DemoBlock {

	public DemoBlock() {
		
		//TODD auto generated constructor for stub
		System.out.println("Constructor Invoked");
		
	}
	
	{
		System.out.println("Non Static Block Invoked");
	}
	
	static
	{
		System.out.println("Static Block Invoked");
	}
	
	public void display() {
		
		System.out.println("Display invoked");
		
	}
	
	public static void show() {
		
		System.out.println("static show function invoked");
		
	}
	
	public static void main(String[] args) {
		
		//DemoBlock.show();
		DemoBlock d= new DemoBlock();
		DemoStatic d1=new DemoStatic();
		d.display();
		
	}
}
