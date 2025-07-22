package exceptionHandlingProgram;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		
		System.out.println(a + " + " + b +" = " + (a+b));
		System.out.println(a + " - " + b +" = " + (a-b));
		try {
			System.out.println(a + " / " + b +" = " + (a/b)); // this try block will throw java.lang.ArithmeticException object		
		}catch(Exception e){
			System.out.println(a + " / " + b +" = Infinity"); // in catch block, ArithmeticException() object will store in e	
			System.out.println(e.getMessage()); // It will print the error message only
			e.printStackTrace(); // It will print exception name with package name with message and all the other details
		}
		System.out.println(a + " * " + b +" = " + (a*b));
		System.out.println("Progrma Ends");
	}

}
