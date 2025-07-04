package methodOverriding;

public class DriverShape {
	public static void main(String[] args) {
//		TwoDShape t1 = new Rectangle();
//		TwoDShape t2 = new Circle();
//		TwoDShape t3 = new Square();
//		
//		t1.area();
//		t2.area();
//		t3.area();
		
		Game g = new Game();
		TwoDShape t = g.selectShape(); // upcasting
		System.out.println(t);
		t.area(); // method overriding
		t.perimeter();
	}
}
