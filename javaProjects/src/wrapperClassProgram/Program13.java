package wrapperClassProgram;

public class Program13 {
	public static void main(String[] args) {
		Object o1 = 345;
		
		System.out.println(o1);
		
		if(o1 instanceof Object) {
			Integer x = (Integer)o1;
			System.out.println(x+100);
		}
		System.out.println("=======Program Ends==========");
	}
}
