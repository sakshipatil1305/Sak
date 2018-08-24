import java.io.FileWriter;
import java.io.IOException;

public class DemoCheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter write = null;

		try {
			write = new FileWriter(" hello.txt");
			write.write("sd");
			System.out.println("ok");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("You got exception");
		}

	}

}
