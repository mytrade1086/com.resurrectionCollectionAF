package mapInterface;

import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<String,String> m =new TreeMap<String,String>();	
		m.put("name", "sagar");
		m.put("city", "Ramtek");
		m.put("college", "kits");
		m.put("branch", "IT");
	
		System.out.println(m);
		//{branch=IT, city=Ramtek, college=kits, name=sagar}  Default Sorting Order is Alphabetical of Key	

	TreeMap<Integer,String> is =new TreeMap<Integer,String>();
		is.put(100, "sagar");
		is.put(4, "sagar");
		is.put(5, "sagar");
		is.put(0, "sagar");
		System.out.println(is);
		//{0=sagar, 4=sagar, 5=sagar, 100=sagar}
	}
}
