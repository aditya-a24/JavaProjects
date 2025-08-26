package wrapperClassProgram;

public class Program21 {
	public static void main(String[] args) {
		Object o1 = 520;
		System.out.println(o1);
		
		Integer x = (Integer) o1;
		System.out.println(x +100);
		System.out.println(x-100);
		System.out.println(x*2);
		System.out.println(x.byteValue());
	}
}
