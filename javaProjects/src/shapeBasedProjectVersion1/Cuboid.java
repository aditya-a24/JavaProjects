package shapeBasedProjectVersion1;

public class Cuboid extends ThreeDShape {
	double l;
	double b;
	double h;
	
	Cuboid(){
		
	}
	
	Cuboid(double l, double b, double h){
		this.l = l;
		this.b = b;
		this.h = h;
	}
	
	@Override
	public void getVolume() {
		System.out.println("Volume of Cuboid is: " + l*b*h +" Cu. Unit");
	}
	
	@Override
	public void getLSA() {
		System.out.println("LSA of Cuboid is: "+ 2*h*(l+b) +" Sq. Unit");
	}
	@Override
	public void getTSA() {
		System.out.println("TSA of Cuboid is: "+ 2*((l*b)+(b*h)+(h*l)) +" Sq. Unit");
	}
}
