package anonymousClassProgram;

public class VehicleDriver {
	public static void main(String[] args) {
		Vehicle car = new Vehicle() {
			public void start() {
				System.out.println("Start Car");
			}
			
			public void drive() {
				System.out.println("Drive Car");
			}
		};
		
		Vehicle bike = new Vehicle() {
			public void start() {
				System.out.println("Start Bike");
			}
			
			public void drive() {
				System.out.println("Drive Bike");
			}
		};
		
		car.start();
		car.drive();
		
		System.out.println("=======================");
		
		bike.start();
		bike.drive();
	}
}
