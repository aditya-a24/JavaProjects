package shapeBasedProjectVersion1;

public class Sphere extends ThreeDShape {
	double r;
	
	Sphere(){
		
	}
	
	Sphere(double r){
		this.r = r;
	}
	
	@Override
	public void getVolume() {
		System.out.println("Volume of Sphere is: " + (4/3)*Math.PI*r*r*r +" Cu. Unit");
	}
	
	@Override
	public void getLSA() {
		System.out.println("LSA/TSA (both are same for a sphere) of Sphere is: "+ 4*Math.PI*r*r +" Sq. Unit");
	}
	@Override
	public void getTSA() {
		System.out.println("LSA/TSA (both are same for a sphere) of Sphere is: "+ 4*Math.PI*r*r +" Sq. Unit");
	}
}
