package fileHandlingPrograms;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st Number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the 2nd Number: ");
		int b = sc.nextInt();
		
		System.out.println("Sum is: "+(a+b));
		
		try {
			System.out.println("Quotient is: "+a/b);
		}catch(Exception e) {
			System.out.println("Infinity");
			System.out.println(10/0);
		}finally {
			System.out.println("Product is: "+a*b);
			sc.close();
			System.out.println("==== Program Ends=====");
		}
	}
}
