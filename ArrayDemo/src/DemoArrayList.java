import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> list=new ArrayList<Integer>();
list.add(10);
list.add(new Integer(23));
list.add(32);
list.add(32);
list.add(2);

System.out.println(list.size());
System.out.println(list);

list.add(2,454);

System.out.println(list.size());
System.out.println(list);

list.remove(0);
System.out.println(list.size());
System.out.println(list);


list.remove(new Integer(32));
System.out.println(list.size());
System.out.println(list);

	}

	
	

}
