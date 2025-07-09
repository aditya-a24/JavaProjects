package encapsulationProgram;

public class Employ {
	private int age;
	private String name;
	private double salary;
	
	Employ(){
		System.out.println("Welcome to Employ class no argument constructor.");
	}
	
	// Constructor setting value of private member too but without validation
	Employ(String name, int age, double salary){
		this.age = age;
		this.name = name;
		this.salary = salary;
		
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Salary is: "+salary);
	}
	
	//setters()
	public void setAge(int age) {
		if(age>=18 && age<=65) {
			System.out.println("Valid Age");
			this.age = age;
		} else {
			System.out.println("Invalid Age Entered");
		}
	}
	
	public void setName(String name) {
		if(name.length() >= 5 && name.length() <= 20 && name.matches("[A-Za-z\s]+")) {
			System.out.println("Valid Name");
			this.name = name;
		} else {
			System.out.println("Invalid Name Entered.");
		}
	}
	
	public void setSalary(double salary) {
		if(salary >= 15000) {
			System.out.println("Valid Salary");
			this.salary = salary;
		} else {
			System.out.println("Invalid Salary.");
		}
	}
	
	
	// getters()
	public int getAge() {
		// validation
		return age;
	}
	
	public String getName() {
		// validation
		return name;
	}
	
	public double getSalary() {
		//validation
		return salary;
	}

}
