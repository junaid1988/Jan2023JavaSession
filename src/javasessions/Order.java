package javasessions;

public class Order {

	public int getOrder(String customerName, int price, int tax) {

		// business logic
		System.out.println(customerName);
		int k = price + tax;
		return k;
	}

	public int getOrder(String customerName, int price) {

		// business logic
		System.out.println(customerName);
		int k = price;
		return k;

	}

	public static void main(String[] args) {

		Order obj = new Order();
		int p = obj.getOrder("Deepa", 1000, 20);
		System.out.println(p);
		
		int d = obj.getOrder("Atul", 120);
		System.out.println(d);

	}

}
