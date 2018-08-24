import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map.Entry;

public class DemoCocurrentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Map<String, String> n = new ConcurrentHashMap<>();
		n.put("Citi", "Pune");
		n.put("Wipro", "Banglore");
		n.put("Oyo", "Gurgaon");
		
		Set<Entry<String, String>> entries = n.entrySet();
		Iterator<Entry<String, String>> iterator = entries.iterator();
		while (iterator.hasNext()) {
		Map.Entry<String,String> entry=(Map.Entry<String,String>) iterator.next();
		if(entry.getKey().equals("Citi"));
		n.put("ZS", "Pune");
		}
		System.out.println(n);
		
	}

}
