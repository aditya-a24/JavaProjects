package builderPatternProgram;

public class Employ {
	
	private final String name;
	private final String id;
	private final int age;
	private final double salary;
	
	private Employ(Builder builder) {
		this.name = builder.name;
		this.id = builder.id;
		this.age = builder.age;
		this.salary = builder.salary;
	}
	
	public static class Builder{
		private String name;
		private String id;
		private int age;
		private double salary;
		
		public Builder() {
			
		}
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public Builder setId(String id) {
			this.id = id;
			return this;
		}
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
		public Builder setSalary(double salary) {
			this.salary = salary;
			return this;
		}
		public Employ build() {
			return new Employ(this);
		}
	}
	
	@Override
	public String toString() {
		return "Name: "+name+"\tId: "+id+"\tAge: "+age+"\tSalary: "+salary;
	}
}
