package abstractClassProgram;

public abstract class Vehicle {
	String name;
	double price;
	String color;
	
	Vehicle() {
		
	}
	
	Vehicle(String name, double price, String color){
		this.name= name;
		this.price = price;
		this.color = color;
	}
	
	public abstract void start();
	public abstract void drive();
	
	public void accelerate() {
		System.out.println("Accelerate Vehicle");
	}
	
	public void stop() {
		System.out.println("Stop Vehicle");
	}
	
	public String getDetails() {
		return "Name is: "+name+"\nPrice is: "+price+"\nColor is: "+color; 
	}
}
