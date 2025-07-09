package encapsulationProgram;

public class EmployDriver {
	public static void main(String[] args) {
		Employ e1 = new Employ();
		e1.setName("Roronoa Zoro");
		e1.setAge(25);
		e1.setSalary(50000.55);
		
		System.out.println("Name is: "+e1.getName());
		System.out.println("Age is: "+e1.getAge());
		System.out.println("Salary is: "+e1.getSalary());
	}
}
