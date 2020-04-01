package collectionInterface;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	
	public static void main(String[] args) {
		
		/*
		 *  SortedSet(1.2) and NavigableSet(1.6) are Interfaces. Treeset implements it.
		 * 
		 */
		
		SortedSet<Integer> ss=new TreeSet<Integer>();
		HashSet<Integer> hs=new HashSet<Integer>();
		
		
		
		for(int i=1;i<=1000000;i++) {
		ss.add(i);
		hs.add(i);
		
		}
		System.out.println(ss);
		System.out.println(hs);
		
		
		
	}

}
