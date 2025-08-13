package wrapperClassProgram;
public class Program12 {
	public static void main(String[] args) {
		Object x = 235;
//		System.out.println(x+100);
		
		Integer y = (Integer)x;
		
		System.out.println(y+100);
		
		System.out.println((Integer)x+100);
		System.out.println(y.byteValue());
	}
}
