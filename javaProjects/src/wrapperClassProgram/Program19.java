package wrapperClassProgram;

public class Program19 {
	public static void main(String[] args) {
		
		// Unparsing - Converting number to string, we use toString() method
		double p = 35.5466;
		String str = Double.toString(p);
		System.out.println("Total Digit in "+p+" is: "+(str.length()-1));
		
		
		// Parsing - Converting number in string into number, we use parseInt()/parseDouble()... method and valueOf() method
		String s1 = "238";
		System.out.println(s1+100); // 238100
		
		int x = Integer.parseInt(s1); // parseInt return non-primitive type data
		System.out.println(x+100); // 338
		
		Integer y = Integer.valueOf(s1); // valueOf will return primitive type data(object)
		System.out.println(y+100); // 338
		
		
		String s2 = "38.22";
		System.out.println(s2+100); // 38.22100
		
		double q = Double.parseDouble(s2);
		System.out.println(q+100); // 138.22
		
		Double r = Double.valueOf(s2);
		System.out.println(r+100); // 138.22
	}
}
