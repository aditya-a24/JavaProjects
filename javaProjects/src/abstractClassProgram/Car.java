package abstractClassProgram;

public abstract class Car extends Vehicle {
	int hp;
	int strokes;
	
	Car() {
		
	}
	
	Car(String name, double price, String color, int hp, int strokes){
		super(name, price, color);
		this.hp = hp;
		this.strokes = strokes;
	}
	
	public abstract void openGate();
	
	public void playMusic() {
		System.out.println("Play Music in Car");
	}
	
	public String getDetails() {
		return super.getDetails() + "\nHp is: "+hp+"\nStrokes is: "+strokes;
	}
}
