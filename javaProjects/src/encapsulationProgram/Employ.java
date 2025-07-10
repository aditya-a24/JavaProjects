package encapsulationProgram;

import java.util.Scanner;

public class Employ {
	private int id = 123;
	private String pwd = "abc";
	private int age;
	private String name;
	private double salary;
	
	/*
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
	*/
	
	//setters()
	public void setId(int id) {
		this.id = id;
	}
	
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
	public int getId() {
		return id;
	}
	
	public int getAge() {
		// validation
		return age;
	}
	
	public String getName() {
		// validation
		return name;
	}
	
	public double getSalary() {
		Scanner sc = new Scanner(System.in);
		System.out.print("For Salary Enter the password: ");
		String pwd = sc.nextLine();
		if(pwd.equals(this.pwd))
			return salary;
		else
			System.out.println("Invalid password entered, Try again");
			return 0;
	}

}
