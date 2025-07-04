package methodOverriding;

public class Rectangle extends TwoDShape {
	double l;
	double w;
	
	Rectangle(){
		
	}
	
	Rectangle(double l, double w){
		this.l = l;
		this.w = w;
	}
	
	@Override
	public void area() {
		System.out.println("Area of Rectangle is: "+ l*w);
	}
}
