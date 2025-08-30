package wrapperClassProgram;

public class Program23 {
	public static void main(String[] args) {
		int x = 110;
		String binary = Integer.toBinaryString(x);
		String octal = Integer.toOctalString(x);
		String hex = Integer.toHexString(x);
		
		System.out.println("Binary is: "+binary);
		System.out.println("Octal is: "+octal);
		System.out.println("Hexadecimal is: "+hex);
		System.out.println("===============================");
		System.out.println(Integer.toString(x, 2));
		System.out.println(Integer.toString(x, 8));
		System.out.println(Integer.toString(x, 16));
	}
}
