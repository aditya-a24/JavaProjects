package exceptionHandlingProgram;

public class Program12 {
	public static void main(String[] args) {
		int a = 10, b = 0;
		int[] arr = {10, 20, 30}; 
		try {
			// only one exception will be thrown from one try block at a time
			System.out.println(a/b); // only this statement will throw exception from this try block
			System.out.println(arr[3]);
		}catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Finally Starts");
			System.out.println(a + " * " + b +" = " + (a*b));
			System.out.println("Finally Stops");
		}
		System.out.println("Program Ends");
	}
}
