package singletonProgram;

public class LazyDriver {
	public static void main(String[] args) {
		Lazy l1 = Lazy.getInstance();
		Lazy l2 = Lazy.getInstance();
		Lazy l3 = Lazy.getInstance();
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
	}
}
