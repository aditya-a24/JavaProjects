package shapeBasedProjectVersion1;

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
	public void getArea() {
		System.out.println("Area of Recatangle is: "+ (l*w) +" Sq. unit");
	}
	
	@Override
	public void getPerimeter() {
		System.out.println("Perimeter of Rectangle is: "+ (2*(l+w)) +" Unit");
	}
}
