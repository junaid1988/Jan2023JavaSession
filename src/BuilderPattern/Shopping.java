package BuilderPattern;

public class Shopping {

	public Shopping login() {
		System.out.println("login to app");
		return this;

	}

	public Shopping login(String un, String pwd) {
		System.out.println("login to app: "+ un +" "+pwd);
		return this;

	}
	
	public Shopping search() {
		System.out.println("product search");
		return this;
		
	}
	
	public Shopping search(String name) {
		System.out.println("product search: " + name);
		return this;
	}
	
	public Shopping addToCart(String name) {
		System.out.println("add to cart: " + name);
		return this;
		
	}
	
	public Shopping doPayment(String cc, int cvv) {
		System.out.println("making payment to: " + cc + " "+ cvv);
		return this;
		
	}
	
	public Shopping doPayment(String upi) {
		System.out.println("making payment: "+ upi);
		return this;
		
	}
	public Shopping generateOrder() {
		System.out.println("order id is 123456");
		return this;
		
	}
	public Shopping logout() {
		System.out.println("logout");
		return this;
	}
	
	
	
	
	
	

}
