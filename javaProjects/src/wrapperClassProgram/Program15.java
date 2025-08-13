package wrapperClassProgram;

public class Program15 {
	public static void main(String[] args) {
		Integer x = 12;
		Integer y = 12;
		// Due to object caching, x and y has same reference, because x and y is in between  value= -128 to 127
		
		System.out.println(x == y); // true
		System.out.println(x.equals(y)); // true
		System.out.println("=================");
		Integer p = 1234;
		Integer q = 1234;
		System.out.println(p == q); // false
		
		System.out.println(p.equals(q)); // true
	}
}
