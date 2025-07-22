package exceptionHandlingProgram;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		
		System.out.print("\nEnter b: ");
		int b = sc.nextInt();
		
		System.out.println(a + " + " + b +" = " + (a+b));
		System.out.println(a + " - " + b +" = " + (a-b));
		System.out.println(a + " / " + b +" = " + (a/b));
		System.out.println(a + " * " + b +" = " + (a*b));
		System.out.println("Progrma Ends");
	}
}
