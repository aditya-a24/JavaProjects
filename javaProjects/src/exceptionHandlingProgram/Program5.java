package exceptionHandlingProgram;

public class Program5 {
	public static void main(String[] args) {
		String s1 = "abcde";
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(5)); // java.lang.StringIndexOutOfBoundsException
	}
}
