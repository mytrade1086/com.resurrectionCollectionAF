package collectionInterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		
		/*
		 * 1.Insertion order maintained
		 * 2.Introduced in 1.4v
		 * 
		 * 
		 */
		LinkedHashSet<String> lsh=new LinkedHashSet<String>();
		
		lsh.add("Shilpa");
		lsh.add("Ratan");
		lsh.add("Aabha");
		lsh.add("Aastha");
		
		lsh.add("Aastha"); //false
		
		
		System.out.println(lsh.add("Aastha"));
		
		
		

	}

}
