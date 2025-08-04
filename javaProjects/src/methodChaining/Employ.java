package methodChaining;

public class Employ {
	String name;
	String id;
	double salary;
	int age;
	
	Employ(){
		
	}
	
	Employ(String name, String id, double salary, int age){
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.age = age;
	}
	
	public Employ getName() {
		System.out.println("Name is: "+name);
		return this;
	}
	public Employ getId() {
		System.out.println("ID is: "+id);
		return this;
	}
	public Employ getSalary() {
		System.out.println("Salary is: "+salary);
		return this;
	}
	public Employ getAge() {
		System.out.println("Age is: "+age);
		return this;
	}
}
