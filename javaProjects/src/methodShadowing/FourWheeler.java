package methodShadowing;

public class FourWheeler extends Vehicle {
	public static void start() {
		System.out.println("Start Four Wheeler");
	}
	
	public void brake() {
		System.out.println("FourWheeler Brake");
	}
}
