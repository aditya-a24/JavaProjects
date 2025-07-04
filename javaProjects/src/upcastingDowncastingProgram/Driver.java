package upcastingDowncastingProgram;

public class Driver {
	public static void main(String[] args) {
		System.out.println(new Car().a);
		System.out.println(new Car().x);
		System.out.println("=================");
		Vehicle v1= new Car();
		System.out.println(v1.a);
		System.out.println("=================");
		Car c1 = (Car)v1;
		System.out.println(c1.a);
		System.out.println(c1.x);
	}
}
