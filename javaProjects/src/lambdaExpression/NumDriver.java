package lambdaExpression;

public class NumDriver {
	public static void main(String[] args) {
		Num isEven = n -> n%2==0;
		
		Num isPrime = n -> {
			if(n<2)
				return false;
			else if(n == 2 || n == 3) 
				return true;
			else if(n%2 == 0)
				return false;
			for(int i = 3 ; i*i <= n ; i+=2) {
				if(n%i == 0)
					return false;
			}
			return true;
		};
		
		int n = 45;
		if(isEven.check(n))
			System.out.println(n + " is an Even Number.");
		else
			System.out.println(n + " is an Odd Number.");
		
		System.out.println("=================================");
		
		
		int num = 346547;
		
		if(isPrime.check(num))
			System.out.println(num + " is a Prime Number.");
		else
			System.out.println(num + " is NOT a Prime Number.");
	}
}
