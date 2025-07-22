package exceptionHandlingProgram;

public class Program4 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		System.out.println(a[2]);
		System.out.println(a[5]); // java.lang.ArrayIndexOutOfBoundsException
	}
}
