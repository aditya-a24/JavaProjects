package methodShadowing;

public class Drive {
	public static void main(String[] args) {
		Vehicle.start(); // Start Vehicle
		FourWheeler.start(); // Start Four Wheeler
		Car.start(); // Start Car
		
		Vehicle v1 = new Car();
		v1.start(); // Start Vehicle
		v1.brake();
		
		FourWheeler fw = new Car();
		fw.start(); // Start Four Wheeler
		fw.brake();
		
		Car c1 = new Car();
		c1.start(); // Start Car
		c1.brake();
		
	}
}
