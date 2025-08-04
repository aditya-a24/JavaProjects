package factoryPattern;

public class FastFoodFactory {
	public FastFood takeRequestAndGive(String req) throws NoSuchItemFoundException {
		switch(req.toLowerCase()) {
		case "pizza":
			System.out.println("Pizza is being Prepared");
			return new Pizza();
		case "burger":
			System.out.println("Pizza is being Prepared");
			return new Pizza();
		case "coke":
			System.out.println("Pizza is being Prepared");
			return new Pizza();
		case "dessert":
			System.out.println("Pizza is being Prepared");
			return new Pizza();
		default:
			throw new NoSuchItemFoundException(req+" is currently Unavailable");
		}
	}
}
