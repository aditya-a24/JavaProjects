package weaponGame;

import java.util.Scanner;

public class Game {
	Game(){
		System.out.println("================Game has started================");
	}
	
	public Weapon selectWeapon() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the score: ");
		int score = sc.nextInt();
		
		if(score <= 400) {
			System.out.println("You got knife");
			Knife k = new Knife();
			return k;
		} else if (score <= 800) {
			System.out.println("Press 1 for knife and 2 for Gun");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("You got knife");
				Knife k = new Knife();
				return k;
			}else {
				System.out.println("you got Gun");
				Gun g = new Gun();
				return g;
			}
			
		} else {
			
			System.out.println("Press 1 for knife, 2 for Gun and 3 for Bomb");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("You got knife");
				Knife k = new Knife();
				return k;
			}else if(choice == 2) {
				System.out.println("you got Gun");
				Gun g = new Gun();
				return g;
			}else {
				System.out.println("You got Bomb");
				Bomb b = new Bomb();
				return b;				
			}
		}
	}
}
