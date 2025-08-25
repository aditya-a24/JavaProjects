package finalKeywordPrograms;

public class Program1 {
	public static void main(String[] args) {
		final int x = 12;
//		x = 40;
		System.out.println(x);
		final int b; // A local final variable (declared inside a method) does not need to be assigned immediately. But it must be assigned exactly once before it is used.
		b = 50;
		System.out.println(b);
	}
}
