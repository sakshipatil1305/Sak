import com.exception.MyException;

public class TestMyException {
	public static void main(String[] args) {
		int age = 1;
		
			try {
				if (age < 18) {
				throw new MyException("not allowed");
			} }catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
