package exceptionHandlingProgram;

public class Program7 {
	public static void main(String[] args) {
		String s1 = "abc";
		System.out.println(s1 + 100);
		int x = Integer.parseInt(s1); // java.lang.NumberFormatException
		System.out.println(x + 100);
	}
}
