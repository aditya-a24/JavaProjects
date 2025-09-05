package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Program14 {
	public static void main(String[] args) {
		List<Integer> c1 = new ArrayList<>();
		
		c1.add(10);
		c1.add(13);
		c1.add(17);
		c1.add(16);
		c1.add(24);
		
		System.out.println(c1);
		for(Integer n : c1) {
			if(n % 2 == 1)
				c1.remove(n); // It will throw ConcurrentModificationException 
		}
		System.out.println(c1);
	}
}


//What's happening internally:
//	The enhanced for loop uses an Iterator under the hood
//	
//Here’s the problem:
//	itr.next() gets the next element and expects the list not to be structurally modified except through itr.remove().
//
//	When you call c1.remove(n), you are modifying the list directly, not through the iterator.
//
//	The iterator detects this unexpected modification (using a modCount check) and throws a ConcurrentModificationException.
	