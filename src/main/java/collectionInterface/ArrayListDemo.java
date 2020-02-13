package collectionInterface;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {

		/*
		 * ##ArrayList 1. Best for item retrieval 
		 * 2. Worst for inserting item in the middle. LinkedList best for middle insertion.
		 * 3. Implements Random Access Interface which allows any index access with same speed 
		 * 4. NOT THREAD SAFE Multiple threads can access simultaneously. 
		 * With Collections class thread safety can be achieved
		 
		 * 5. ArrayList<String> al=new ArrayList<String>(); Creates empty array list
		      with default initial capacity 10
		  
		 * When arrayList reaches its maximum capacity new array list is created.Old
		 * elements are copied into it and references moved.
		 
		 * new capacity=(current capacity *3/2)+1
		 */

		ArrayList<String> al = new ArrayList<String>();
		System.out.println(al.size()); // 0 Physical Size 0 as no item added
		System.out.println(al.isEmpty()); // true Since List is empty
		System.out.println(al.add("first")); // true Will add item at 0 index as first item. This version has no return
												// type
		System.out.println(al.isEmpty()); // false Since List is not empty now

		System.out.println(al.size()); // 1 Physical Size
		al.add(1, "sagar"); // Add "sagar" at index 1

		System.out.println(al.size()); // 2 Since 2 items now with index 0 and 1

		System.out.println(al); // [10, sagar]
		al.add(1, "Sumit");
		System.out.println(al);
		; // [10, Sumit, sagar] Adding new element "Sumit" SHIFTS the list to right

		/*
		 * Now list has two items (0,1) and we are trying to add value to index 3
		 * al.add(4,"test"); //Exception in thread "main"
		 * java.lang.IndexOutOfBoundsException: Index: 3, Size: 2
		 * 
		 */

		/*
		 * Adding int data in String type arrayList will result in exception
		 * System.out.println(al.add(10)); //Exception The method add(int, String) in
		 * the type ArrayList<String> is not applicable for the arguments (int)
		 */

		System.out.println(al.contains("10")); // true
		System.out.println(al.contains(8)); // false (No exception just warning when we use contains() for different
											// data type)
		System.out.println(al.indexOf("Sumit")); // 1 first occurrence of "Sumit"
		System.out.println(al.indexOf("sumit")); // -1
		System.out.println(al.lastIndexOf("S"));// -1

		// Reading from arrayList

		System.out.println(al.get(0)); // first

		/*
		 * System.out.println(al.get(-1)); //Exception in thread "main"
		 * java.lang.ArrayIndexOutOfBoundsException: -1 System.out.println(al.get(5));
		 * //Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 5,
		 * Size: 3
		 */

		System.out.println(al.size()); // 3
		// System.out.println(al.remove(5)); //Exception in thread "main"
		// java.lang.IndexOutOfBoundsException: Index: 5, Size: 3

		System.out.println(al.remove(2)); // returns value at specified index or throws exception
		System.out.println(al.size()); // 2

		// al.remo

		System.out.println(al); // [first, Sumit]

		System.out.println(al.add("latest"));
		System.out.println(al); // [first, Sumit, latest]

		System.out.println((al.set(2, "sagar"))); // "Latest" returns old value at that index
		// IndexOutOfBoundsException if there is no index

		System.out.println(al); // [first, Sumit, sagar]

		// Looping######################################################33

		for (int i = 0; i < al.size(); i++) {

			System.out.println(al.get(i));
			// first
			// Sumit
			// sagar
		}

		for (String s : al) {
			System.out.println(s);
			// first
			// Sumit
			// sagar }

			// al.forEach((a)->System.out.println(a));

			ArrayList<String> al2 = new ArrayList<String>();
			al2 = al;

			System.out.println(al2.equals(al)); // true

			ArrayList<String> al3 = new ArrayList<String>();
			System.out.println(al3.equals(al)); // false

		}

		System.out.println(al.remove("sagar")); // true if sagar was present
		System.out.println(al.remove("d")); // false
		
		al.add("neha");
		al.add("swini");
		System.out.println(al);//[first, Sumit, neha, swini]
		System.out.println(al.subList(0,3)); // [first, Sumit, neha]
		
		
		
		
		
		
		
		
		
		

	}

}
