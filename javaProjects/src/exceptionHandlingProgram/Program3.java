package exceptionHandlingProgram;

public class Program3 {
	public static void main(String[] args) {
	System.out.println("Program3 starts");
	//System.out.println(10/0);
	throw new ArithmeticException("/ by Zero");
	}
}
