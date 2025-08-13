package wrapperClassProgram;

public class Program6 {
	public static void main(String[] args) {
		int x = 1612;
		
		// In binary String conversion
		String bin = Integer.toString(x, 2);
		
		// In Octal String Conversion
		String oct = Integer.toString(x, 8);
		
		// In Hexadecimal String Conversion
		String hex = Integer.toString(x, 16);
		
		System.out.println(x + " in binary is: "+bin);
		System.out.println(x + " in Octal is: "+oct);
		System.out.println(x + " in Hexadecimal is: "+hex);
	}
}
