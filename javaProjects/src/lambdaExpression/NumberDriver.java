package lambdaExpression;

public class NumberDriver {
	public static void main(String[] args) {
		NumberOperation isEven = x -> {
			if(x % 2 == 0)
				System.out.println(x + " is Even.");
			else
				System.out.println(x + " is Odd.");
		};
		
		NumberOperation factorial = (int n ) -> {
			int fact  = 1;
			for(int i = 1; i <= n ; i++) {
				fact = fact * i;
			}
			System.out.println(n + " != "+ fact);
		};
		
		isEven.operate(24);
		isEven.operate(33);
		factorial.operate(6);
		factorial.operate(8);
	}
}
