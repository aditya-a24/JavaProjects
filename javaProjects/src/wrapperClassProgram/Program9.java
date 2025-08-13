package wrapperClassProgram;

public class Program9 {
	public static void main(String[] args) {
		String s1 = "2a8";
		
		int x = Integer.parseInt(s1);
		
		System.out.println(x+100); // it will throw NumberFormatException
	}
}
