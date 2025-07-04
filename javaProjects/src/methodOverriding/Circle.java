package methodOverriding;

public class Circle extends TwoDShape {
	double r;
	
	Circle(){
		
	}
	
	Circle(double r){
		this.r = r;
	}
	
	@Override
	public void area() {
		System.out.println("Area of Circle is: " + Math.PI*r*r);
	}
	
	@Override
	public void perimeter() {
		System.out.println("Perimeter of circle is: ");
	}
}
