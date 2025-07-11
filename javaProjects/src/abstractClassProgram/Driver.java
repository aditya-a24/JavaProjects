package abstractClassProgram;

public class Driver {
	public static void main(String[] args) {
		Vehicle v1 = new ElectricCar("TATA", 435323.45, "White", 150, 8, 400);
		
		v1.start();
		v1.drive();
		v1.accelerate();
		v1.stop();
		System.out.println("Vehicle details:\n"+v1.getDetails());
		System.out.println("===================");
		
		Car c1 = (Car) v1;
		c1.start();
		c1.drive();
		c1.accelerate();
		c1.stop();
		c1.openGate();
		c1.playMusic();
		System.out.println("Vehicle details:\n"+c1.getDetails());
		System.out.println("===================");
		
		ElectricCar e1 = (ElectricCar) v1;
		e1.start();
		e1.drive();
		e1.accelerate();
		e1.stop();
		e1.openGate();
		e1.playMusic();
		e1.charge();
		System.out.println("Vehicle details:\n"+e1.getDetails());
		System.out.println("===================");
	}
}
