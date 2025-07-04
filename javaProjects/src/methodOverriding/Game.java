package methodOverriding;

import java.util.Scanner;

public class Game {
	Game(){
		System.out.println("============Game has Started===============");
	}
	
	public TwoDShape selectShape() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to Select ==> Circle");
		System.out.println("Press 2 to Select ==> Rectangle");
		System.out.println("Press 3 to Select ==> Square");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("You have selected Circle");
			System.out.println("Enter the Radius: ");
			double radius = sc.nextDouble();
			Circle c1 = new Circle(radius);
		return c1; // return object reference of Circle
		}
		
		else if(choice == 2) {
			System.out.println("You have selected Rectangle");
			Rectangle r1 = new Rectangle();
		return r1; // return object reference of Rectangle
		}
		
		else if(choice == 3) {
			System.out.println("You have selected Square");
			Square s1 = new Square();
		return s1; // return object reference of Square
		}
		
		else {
			System.out.println("You have entered INVALID Choide!!");
		return selectShape();
		}
	}
}
