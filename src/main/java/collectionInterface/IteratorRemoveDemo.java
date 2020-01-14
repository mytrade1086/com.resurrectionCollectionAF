package collectionInterface;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemoveDemo {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			al.add(i);
		}

		System.out.println(al); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

		Iterator it = al.iterator();

		while (it.hasNext()) {
			int i = (Integer) it.next();
			if (i % 2 == 0) {
				System.out.println(i);
//			2
//			4
//			6
//			8
//			10

			}

			else
				it.remove();

			{

			}

		}

		System.out.println(al); // [2, 4, 6, 8, 10]

	}
}
