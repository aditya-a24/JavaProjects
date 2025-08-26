package wrapperClassProgram;

public class Program20 {
	public static void main(String[] args) {
		Object o1 = "mohan";
		
		String s1 = (String) o1;
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.charAt(2));
		

		System.out.println(((String)o1).length());
		System.out.println(((String)o1).toUpperCase());
		System.out.println(((String)o1).charAt(2));
	}
}
