package abstractClassProgram;

public abstract class Employ {
	
	static String compName = "TATA"; // static variable
	String name; // non-static variable
	int id; // non-static variable
	double salary; // non-static variable
	
	Employ(){
		
	}
	
	Employ(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
}
