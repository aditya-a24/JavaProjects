package lambdaExpression;

import java.util.HashMap;
import java.util.Map;

public class Driver {
	public static void main(String[] args) {
//		Car c1 = new Car();
//		
//		c1.drive();
		
		Vehicle car = () -> {
			System.out.println("Drive Car");			
		};
		
		Vehicle bike = () -> {
			System.out.println("Drive Bike");
		};
		
		Vehicle train = () -> {
			System.out.println("I am Train");
			System.out.println("I am now starting");
			System.out.println("Now Drive me");
		};
		
		car.drive();
		bike.drive();
		train.drive();
		Map<Integer, Integer> m1 = new HashMap<>();
		m1.forEach(null);
	}
}
