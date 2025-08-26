package singletonProgram;

public class EagerDriver {
	public static void main(String[] args) {
		Eager e1 = Eager.getInstance();
		Eager e2 = Eager.getInstance();
		
		System.out.println(e1);
		System.out.println(e2);
	}
}
