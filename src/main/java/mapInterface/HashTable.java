package mapInterface;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable {
	
	//Thread safe. everything remains same
	//ht.keys()  enumeration object present
	
	public static void  main(String[]args) {
		
		
		Hashtable <String,String> ht=new Hashtable<String,String>();
		ht.put("name", "sumit");
		ht.put("loc", "airoli");
		ht.put("lob", "tsl");
		
		//ht.keys()
		
		Set<Entry<String,String>> htitem= ht.entrySet();
		
		for(Entry<String, String> item:htitem) {
			System.out.println(item.getKey()+" "+item.getValue());
		}
		
	}

}
