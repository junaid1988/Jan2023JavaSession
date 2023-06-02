package practice;

public class BMW extends Car {
	
	private int min_speed = 200;
	
	public void speedCal() {
		System.out.println(min_speed);//BMW
		int carSpeed = super.min_speed;
		int diff = min_speed - carSpeed;
		System.out.println(diff);
		
	}
	
	@Override
	public void display() {
		System.out.println("BMW display");
		super.display();
	}


	public BMW() {

		super("BMW X7", 56000);
		System.out.println("BMW const...");
	}

	public BMW(int price) {

		super("Audi Q7", 65000);
		System.out.println("Audi const...");
	}

}
