package fileHandlingPrograms;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);){
			System.out.println("Enter the 1st Number: ");
			int a = sc.nextInt();
			
			System.out.println("Enter the 2nd Number: ");
			int b = sc.nextInt();
			
			System.out.println("Sum is: "+(a+b));
			System.out.println("Quotient is: "+a/b);
			System.out.println("Product is: "+a*b);
		}catch(Exception e){
			System.out.println("Infinity");
		}
		System.out.println("==== Programs Ends =====");
	}
}
