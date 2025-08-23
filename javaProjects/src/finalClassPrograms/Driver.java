package finalClassPrograms;

public class Driver {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Samsung", 39800.50, 8);
		System.out.println("Name is: " +m1.getName());
		System.out.println("Price is: "+m1.getPrice());
		System.out.println("Ram is: "+m1.getRam());
	}
}
