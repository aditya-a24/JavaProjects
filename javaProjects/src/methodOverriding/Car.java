package methodOverriding;

public class Car extends Vehicle {
	int a = 70;
	int y = 80;
	
	@Override
	public void start() {
		System.out.println("Start Car");
	}
}
