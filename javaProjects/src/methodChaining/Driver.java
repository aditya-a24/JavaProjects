package methodChaining;

public class Driver {
	public static void main(String[] args) {
		Employ e1 = new Employ("Mohan", "mohan123", 24325.5, 24);
		Employ e2 = new Employ("Sohan", "sohan123", 20325.5, 23);
		Employ e3 = new Employ("Rohan", "rohan123", 28325.5, 26);
		Employ e4 = new Employ("John", "jhan123", 26325.5, 22);
		
		e1.getName().getSalary().getAge();
		
		System.out.println("=========================");
		e2.getSalary().getId();
		
		System.out.println("=========================");
		e3.getId().getAge().getSalary().getAge().getName();
	}
}
