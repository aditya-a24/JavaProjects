package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program10 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(12);
		l1.add(18);
		l1.add(15);
		l1.add(17);
		l1.add(10);
		l1.add(12);
		System.out.println(l1);
		System.out.println("======= Remove Element using iterator() method =======");
		Iterator<Integer> itr = l1.iterator(); // this method creates a cursor object on List l1 at starting position
		while(itr.hasNext()) {
			int x = itr.next();
			if(x % 2 == 1)
				itr.remove();
		}
		System.out.println(l1);
	}
}
