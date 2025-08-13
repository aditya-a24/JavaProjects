package wrapperClassProgram;

public class Program11 {
	public static void main(String[] args) {
		Object o1 = "abcde";
		
		System.out.println(o1);
		
		String s1 = (String)o1;
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length());
		System.out.println("====================");
		System.out.println(((String)o1).length());
		System.out.println(((String)o1).toUpperCase());
		
	}
}
