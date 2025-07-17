package webDriverHierarchy;

public interface SearchContext {
	public void findElement();
	
	// java 8 feature
	default public void test() {
		System.out.println("default test method");
		pay("Hello");
		start();
	}
	
	// java 8 feature
	default public void demo() {
		System.out.println("default demo method");
		pay("Hello");
		start();
		drive();
	}
	// we can write main inside interface
/*	public static void main(String[] args) {
		System.out.println("Main method of SearchContext");
	}
	*/
	
	// static method, java 8 feature
	public static void pay(String s) {
		System.out.println(s);
		System.out.println("Payment is starting");
		System.out.println("enter amount");
		System.out.println("Payment is successfully done");
	}
	
	// Private method, java 9 feature
	private static void drive() {
		System.out.println("Private drive method");
	}
	
	// we can also create private non - static method in interface
	private void start() {
		System.out.println("Start method");
	}
	
	
}
