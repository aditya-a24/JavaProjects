package weaponGame;

public class User {
	public static void main(String[] args) {
		Game g = new Game();
		Weapon w = g.selectWeapon(); // upcasting
		System.out.println(w); // print the reference of weapon according to score
		w.use(); // method override
	}
}
