package weaponGame;

public class Gun extends Weapon {
	
	@Override
	public void use() {
		System.out.println("Use the Gun");
		System.out.println("Load the Gun");
		System.out.println("Aim at enemy");
		System.out.println("Fire");
	}
}
