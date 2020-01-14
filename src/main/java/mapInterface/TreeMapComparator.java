package mapInterface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapComparator {
	
	
	
	public static void main(String[] args) {
		
	
	TreeMap<String,String> m =new TreeMap<String,String>();	
	m.put("name", "sagar");
	m.put("city", "Ramtek");
	m.put("college", "kits");
	m.put("branch", "IT");

	System.out.println(m);
	
	}
	

}

class comparatorDemo implements Comparator{

	public int compare(Object arg0, Object arg1) {
		
		return 0;
	}
	
	
}