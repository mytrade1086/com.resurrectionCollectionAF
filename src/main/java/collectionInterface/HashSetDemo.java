package collectionInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		

		/*
		 * 1. Does not preserve insertion Order. Use LinkedHashSert if want insertion order preservation
		 * 2. Insertion based on Hashcode of objects
		 * 3.Duplicates are not stored.
		 * 4.If we try to add duplicate item .add() returns false.
		 * 5.Default capacity is 16. Once 75 percent is filled new HashSet is created
		 */ 

		HashSet<String> hs = new HashSet<String>();

		hs.add("Newton");
		hs.add("Bose");
        hs.add("Newton"); // true
		System.out.println(hs.add("Newton")); // false "If we try to add existing item in Set
		hs.add("Tesla");
		
		
		

		Iterator<String> hsit = hs.iterator();
		while (hsit.hasNext()) {
			String s = hsit.next();
			System.out.println(s);
			
			
		}

	}

}
