package wrapperClassProgram;

public class Program17 {
	public static void main(String[] args) {
		Integer x = null;
		Integer y = null;
		Integer z = 45;
		
//		System.out.println(x.byteValue()); // throw NullPointerException
		//System.out.println(x.equals(z)); // throw NullPointerException
		
		System.out.println(z.equals(x)); // false
		System.out.println(x.equals(z)); // throw NullPointerException
	}
}
