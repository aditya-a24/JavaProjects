package methodOverriding;

public class Driver {
	public static void main(String[] args) {
//		Car c1 = new Car();
//		c1.start(); // start() method of Vehicle class
		
//		Vehicle v1 = new Car(); // Upcasting
//		v1.start(); // Method Overriding, start() method of Car class
//		Car c1 = (Car) v1; // Downcasting to access the feature of Car Class
		
		
		Vehicle v1 = new Car();
		System.out.println(v1.a); // it will show a of vehicle
		System.out.println(v1.x);
		v1.start(); // Its Method Overriding
		System.out.println("=====================");
		System.out.println(((Car)v1).a); // In case of variable, same name variable of child class is showing variable hiding.
		System.out.println(((Car)v1).y);
		v1.start(); // Showing Start Car
		((Car)v1).start();  // Showing Start Car, In case of method, same name method of child class is showing method overriding it will change the method of parent class too.
	}
}
