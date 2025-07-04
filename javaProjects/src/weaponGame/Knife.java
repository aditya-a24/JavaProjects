package weaponGame;

public class Knife extends Weapon {
	
	@Override
	public void use(){
		System.out.println("Use the Knife");
	}
	
	public void swing() {
		System.out.println("Aim at enemy");
	}
}
