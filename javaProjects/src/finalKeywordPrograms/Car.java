package finalKeywordPrograms;

public class Car {
	final static String brand; // final static variable
	final String carno; // final non static variable

	
	double price; // static variable
	String color; // static variable\
	
	
	static {
		brand = "TATA";
	}
	Car(String carno){
		this.carno = carno;
	}
	
	Car(double price, String carno){
		this.price = price;
		this.carno = carno;
	}
	
	Car(String carno, String color, double price){
		this.carno = carno;
		this.color = color;
		this.price = price;
	}
}
