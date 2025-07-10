package encapsulationProgram;

public class EmployDriver {
	public static void main(String[] args) {
		Employ e1 = new Employ();
		
		String name = "Roronoa Zoro";
		int age = 25;
		double salary = 55000.50;
		
		e1.setName(name);
		e1.setAge(age);
		e1.setSalary(salary);
		
		System.out.println("Name is: "+e1.getName());
		System.out.println("Age is: "+e1.getAge()+" Years");
		System.out.println("Salary is: "+e1.getSalary()+" Rupees");
	}
}
