package builderPatternProgram;

public class Driver {
	public static void main(String[] args) {
		Employ e1 = new Employ.Builder().setName("Mohan").setId("mohan123").setAge(23).build();
		
		Employ e2 = new Employ.Builder().setName("Sohan").setSalary(345678).build();
		
		Employ e3 = new Employ.Builder().build();
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}
