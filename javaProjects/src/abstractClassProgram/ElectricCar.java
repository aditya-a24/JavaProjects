package abstractClassProgram;

public class ElectricCar extends Car {
	int volt;
	
	ElectricCar(){
		
	}
	
	ElectricCar(String name, double price, String color, int hp, int strokes, int volt){
		super(name, price, color, hp, strokes);
		this.volt = volt;
	}
	
	@Override
	public void start() {
		System.out.println("Start Electric Car");
	}
	
	@Override
	public void drive() {
		System.out.println("Drive Electric Car");
	}
	
	@Override
	public void openGate() {
		System.out.println("Open Gate of Electric Car");
	}
	
	public void charge() {
		System.out.println("Charge Elecric Car");
	}
	
	public String getDetails() {
		return super.getDetails()+"\nVolt is: "+volt;
	}	
}
