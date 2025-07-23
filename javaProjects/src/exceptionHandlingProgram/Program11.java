package exceptionHandlingProgram;

public class Program11 {
	public static void main(String[] args) {
		int a = 10, b = 0;
		int[] arr = {10, 20, 30}; 
		try {
			// only one exception will be thrown from one try block at a time
			System.out.println(a/b); // only this statement will throw exception from this try block
			System.out.println(arr[3]);
		}catch (ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
