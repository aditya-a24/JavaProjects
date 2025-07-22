package exceptionHandlingProgram;

public class Program6 {
	public static void main(String[] args) {
		String s1 = "abcde";
		
		System.out.println(s1.length());
		
		s1=null;
		System.out.println(s1.length()); // java.lang.NullPointerException
	}
}
