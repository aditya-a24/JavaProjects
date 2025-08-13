package anonymousClassProgram;

public class ProductDriver {
	public static void main(String[] args) {
		Product shirt = new Product() {
			public void addToCart() {
				System.out.println("Add shirt in Cart");
			}
			
			public void buy() {
				System.out.println("Buy Shirt");
			}
		};
		
		shirt.addToCart();
		shirt.buy();
	}
}
