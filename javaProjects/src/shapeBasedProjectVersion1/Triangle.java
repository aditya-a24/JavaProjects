package shapeBasedProjectVersion1;

public class Triangle extends TwoDShape {
	double a;
	double b;
	double c;
	
	Triangle(){
		
	}
	
	Triangle(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public void getArea() {
		if((a+b > c) && (b+c > a) && (a+c > b)) {
			double s = (a+b+c)/2;
			double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			System.out.println("Area of Triangle is: "+area);
		} else {
			System.out.println("You have entered invalid sides of triangle.");
		}		
	}

	@Override
	public void getPerimeter() {
		if((a+b > c) && (b+c > a) && (a+c > b)) {
			double perimeter = a+b+c;
			System.out.println("Perimeter of Triangle is: "+perimeter);
		} else {
			System.out.println("You have entered invalid sides of triangle.");
		}		
	}
}
