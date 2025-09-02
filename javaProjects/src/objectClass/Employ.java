package objectClass;

import java.util.Objects;

public class Employ implements Cloneable{
	String name;
	int id;
	double salary;
	Employ(){
		
	}
	
	Employ(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String toString() {
		return "Name is: "+name+"\tId is: "+id+"\tSalary is: "+salary;
	}
	
	public int hashCode() {
		return Objects.hash(name, id, salary);
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		else if(obj == null || this.getClass() != obj.getClass())
			return false;
		
		Employ e = (Employ)obj; // downcasting to employe
		return this.id == e.id && this.salary == e.salary && this.name.equalsIgnoreCase(e.name);
		
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public void finalize() {
		System.out.println("Finalize Method Called");
	}
}
