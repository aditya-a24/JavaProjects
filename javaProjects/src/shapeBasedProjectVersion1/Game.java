package shapeBasedProjectVersion1;

import java.util.Scanner;

public class Game {
	Game(){
		System.out.println("===========Welcome to game============");
	}
	
	public void startGame() {
		Scanner sc = new Scanner(System.in);
		char c;
		
		do {
			System.out.println("Press 1 for 2-D Shape");
			System.out.println("Press 2 for 3-D Shape");
			
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("You have seleceted 2-D Shape");
				TwoDShape t1 = selectTwoDShape();
				t1.rotate();
				t1.getArea();
				t1.getPerimeter();
			}else if(choice == 2) {
				System.out.println("You have seleceted 3-D shape.");
				ThreeDShape t1 = selectThreeDShape();
				t1.rotate();
				t1.getLSA();
				t1.getTSA();
				t1.getVolume();
			}else {
				System.out.println("This is invalid option");
				startGame();
			}				
			
			System.out.println("\n=====Enter Y/y to continue or any other key to exit.=====");
			c = sc.next().charAt(0);
		}while(c == 'y' || c == 'Y');
		System.out.println("\n============Thanks for playing the Game==============");	
	}
	
	public static TwoDShape selectTwoDShape() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to Select ==> Circle");
		System.out.println("Press 2 to Select ==> Rectangle");
		System.out.println("Press 3 to Select ==> Square");
		System.out.println("Press 4 to Select ==> Triangle");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("You have selected Circle");
			System.out.println("Enter the Radius: ");
			double radius = sc.nextDouble();
			Circle c1 = new Circle(radius);
			return c1; // return object reference of Circle
		} else if(choice == 2) {
			System.out.println("You have selected Rectangle");
			System.out.println("Enter the length: ");
			double length = sc.nextDouble();
			System.out.println("Enter the width: ");
			double width = sc.nextDouble();
			Rectangle r1 = new Rectangle(length, width);
			return r1; // return object reference of Rectangle
		} else if(choice == 3) {
			System.out.println("You have selected Square");
			System.out.println("Enter the sides: ");
			double side = sc.nextDouble();
			Square s1 = new Square(side);
			return s1; // return object reference of Square
		} else if(choice == 4) {
			System.out.println("You have selected Triangle");
			System.out.println("Enter the side1: ");
			double side1 = sc.nextDouble();
			System.out.println("Enter the side2: ");
			double side2 = sc.nextDouble();
			System.out.println("Enter the side3: ");
			double side3 = sc.nextDouble();
			Triangle s1 = new Triangle(side1, side2, side3);
			return s1; // return object reference of Triangle
		} else {
			System.out.println("You have entered INVALID Choide!!");
			return selectTwoDShape();
		}
	}
	
	public static ThreeDShape selectThreeDShape() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to Select ==> Cylinder");
		System.out.println("Press 2 to Select ==> Cone");
		System.out.println("Press 3 to Select ==> Cube");
		System.out.println("Press 4 to Select ==> Cuboid");
		System.out.println("Press 5 to Select ==> Sphere");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("You have selected Cylinder");
			System.out.println("Enter the Radius: ");
			System.out.println("Enter the Height: ");
			double radius = sc.nextDouble();
			double height = sc.nextDouble();
			Cylinder c1 = new Cylinder(radius, height);
		return c1; // return object reference of Cylinder
		}
		
		else if(choice == 2) {
			System.out.println("You have selected Cone");
			System.out.println("Enter the Radius: ");
			double radius = sc.nextDouble();
			System.out.println("Enter the Height: ");
			double height = sc.nextDouble();
			System.out.println("Enter the Slant Height: ");
			double slantHeight = sc.nextDouble();
			Cone r1 = new Cone(radius, height, slantHeight);
		return r1; // return object reference of Cone
		}
		
		else if(choice == 3) {
			System.out.println("You have selected Cube");
			System.out.println("Enter the Side: ");
			double side = sc.nextDouble();
			Cube s1 = new Cube(side);
		return s1; // return object reference of Cube
		}
		
		else if(choice == 4) {
			System.out.println("You have selected Cuboid");
			System.out.println("Enter the Length: ");
			double length = sc.nextDouble();
			System.out.println("Enter the Bredth: ");
			double bredth = sc.nextDouble();
			System.out.println("Enter the Height: ");
			double height = sc.nextDouble();
			Cuboid s1 = new Cuboid(length, bredth, height);
		return s1; // return object reference of Cuboid
		}
		
		else if(choice == 5) {
			System.out.println("You have selected Sphere");
			System.out.println("Enter the Radius: ");
			double radius = sc.nextDouble();
			Sphere s1 = new Sphere(radius);
		return s1; // return object reference of Square
		}
		
		else {
			System.out.println("You have entered INVALID Choide!!");
		return selectThreeDShape();
		}
	}
}
