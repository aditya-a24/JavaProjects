package methodOverriding;

public class Square extends TwoDShape {
	double side;
	
	Square(){
		
	}
	
	Square(double side){
		this.side = side;
	}
	
	@Override
	public void area() {
		System.out.println("Area of square is: "+ side * side);
	}
}
