package factoryPattern;

public class Pizza implements FastFood {
	
	{
		System.out.println("Pizza is Cooked");
	}
	
	@Override
	public void printDetails() {
		System.out.println("I'm Pizza");
	}
}
