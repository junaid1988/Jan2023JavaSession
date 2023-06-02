package practice;

public class Car {
	
	String name;
	int price;
	
	int min_speed = 100;
	
	
	public Car(String name, int price) {
		System.out.println(name+ " "+ price);
		this.name = name;
		this.price = price;
	}
	
	public Car() {
		System.out.println("Car const.....");
	}
	
	public void display() {
		System.out.println("car display");
	}
	

}
