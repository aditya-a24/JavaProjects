package singletonProgram;

public class Lazy {
	private static Lazy l = null;
	
	private Lazy() {
		
	}
	
	public static Lazy getInstance() {
		if(l == null)
			l = new Lazy();
		return l;
	}
}
