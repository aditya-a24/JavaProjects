package wrapperClassProgram;

public class Program22 {
	public static void main(String[] args) {
		Integer x = 10;
		Integer y = 20;
		Integer z = 20;
		System.out.println(x.compareTo(y)); // -1
		System.out.println(y.compareTo(x)); // 1
		System.out.println(y.compareTo(z)); // 0
	}
}
