package interfacePart;

public class ElectricCar implements Car {
	
	@Override
	public void start() {
		System.out.println("Start Electric Car");
	}
	
	@Override
	public void stop() {
		System.out.println("Stop Electric Car");
	}
	
	@Override
	public void openGate() {
		System.out.println("Open Gate in Electric Car");
	}
	
	public void charge() {
		System.out.println("Charge Electric Car");
	}
}
