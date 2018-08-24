import java.nio.file.attribute.AclEntry.Builder;

public class DemoStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder builder = new StringBuilder("citi");
		System.out.println("Earlier "+builder);
		
		builder.append("corp");
		System.out.println("Now "+builder);
		
		builder.setLength(3);
		
		System.out.println(builder);
		
		int p = builder.length();
		
		System.out.println(p);
		
		
		
	}
	


}
