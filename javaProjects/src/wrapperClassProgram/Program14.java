package wrapperClassProgram;

public class Program14 {
	public static void main(String[] args) {
		Object o1 = 256;
		System.out.println(o1);
		if(o1 instanceof Integer x) {
//			Integer x = (Integer)o1;
			System.out.println(x+100);
			
			System.out.println(x.byteValue());
		}
	}
}
