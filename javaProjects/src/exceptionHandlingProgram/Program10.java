package exceptionHandlingProgram;

public class Program10 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		for(int i  = 1; i<= 10 ; i++) {
			System.out.println("i is: "+i);
			try {
				Thread.sleep(800);
			} catch (Exception e) {
				System.out.println("Hey Thread! I am pissed off");
				System.out.println("You have interrupted me");
				e.printStackTrace();
			}
		}
		
		System.out.println("Program Ends");
	}
}
