package methodShadowing;

public class Vehicle {
	public static void start() {
		System.out.println("Start Vehicle");
	}
	
	public void brake() {
		System.out.println("Vehicle Brake");
	}
}
