package wrapperClassProgram;

public class Program8 {
	public static void main(String[] args) {
		int x = 130;
		String bin =  Integer.toBinaryString(x);
		
		String oct = Integer.toOctalString(x);
		
		String hex = Integer.toHexString(x);
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}
}
