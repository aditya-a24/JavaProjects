package methodShadowing;

public class Car extends FourWheeler {
	public static void start() {
		System.out.println("Start Car");
	}
	
	public void brake() {
		System.out.println("Car Brake");
	}
}
