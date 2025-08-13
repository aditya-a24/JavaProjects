package wrapperClassProgram;

public class Program7 {
	public static void main(String[] args) {
		String s1 = "238";
		
		System.out.println(s1 + 100);
		
		int x = Integer.parseInt(s1); // parseInt is use to convert String into integer
		
		Integer y = Integer.valueOf(s1); // valueOf is use to convert String into integer
		
		System.out.println(x + 100);
		System.out.println(y+100);
	}
}
