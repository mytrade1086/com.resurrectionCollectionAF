package collectionInterface;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("1");
		ll.add("2");
		ll.add("3");
		System.out.println(ll); //[1, 2, 3]
		
		ll.add(2, "22");
		System.out.println(ll); //[1, 2, 22, 3]
		
		ll.addFirst("11");
		System.out.println(ll); //[11, 1, 2, 22, 3]
		
		ll.addLast("LL");
		System.out.println(ll); //[11, 1, 2, 22, 3, LL]
		
		
		
		System.out.println(ll.removeFirst()); //11
		
		System.out.println(ll.removeLast());//LL
		
		
		
	}

}
