import java.util.NavigableSet;
import java.util.TreeSet;

public class DemoNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NavigableSet<String> set= new TreeSet();
		
		set.add("India");
		set.add("Japan");
		set.add("US");
		set.add("UK");
		set.add("Australia");
		
		System.out.println(set);
		System.out.println(set.headSet("India", true));
		System.out.println(set.tailSet("Japan", false));

	}

}
