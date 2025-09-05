package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Program13 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(12);
		l1.add(18);
		l1.add(15);
		System.out.println(l1);
		
//		l1.remove(18); // by default list remove method has remove(int index) method so it will throw IndexOutOfBoundsException
		l1.remove((Object)18); // so we need to typecast it to Object to call list.remove(Object o);
		System.out.println(l1);
	}
}
