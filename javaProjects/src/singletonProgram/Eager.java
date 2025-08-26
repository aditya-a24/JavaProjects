package singletonProgram;

public class Eager {
	private static Eager e = new Eager();
	
	private Eager() {
		
	}
	
	public static Eager getInstance() {
		return e;
	}
}
