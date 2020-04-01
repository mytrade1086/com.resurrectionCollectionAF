package collectionInterface;

import java.util.ArrayList;

import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			al.add(i + " item ");
		}

		Iterator il = al.iterator();
		// #Printing all elements
		while (il.hasNext()) {
			System.out.println(il.next());
		}
		System.err.println("________________________");

		// Printing element based on condition

		Iterator il2 = al.iterator();
		while (il2.hasNext()) {
			String str = (String) il2.next();
			if (str.contains("4")) {
				System.out.println(str);
			}
		}
	}
}

/*
 * OUTPUT########################################3
 * 
 * 0 item
 * 
 * 1 item
 * 
 * 2 item
 * 
 * 3 item
 * 
 * 4 item
 * 
 * ________________________
 * 
 * 4 item
 * 
 */
