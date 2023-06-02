package OOP_Inheritance;

//IS - A Relationship
public class Car extends Vehicle {
	
	//final:
	//is used to prevent inheritance
	//is used to prevent method overriding
	//to for constant values
	
	public final void service() {
		System.out.println("Car -- service");
	}
	
	public void start() {
		System.out.println("car-- start");
		
		
	}
	public void stop() {
		System.out.println("car-- stop");
		
	}
	public void refuel() {
		System.out.println("car-- refuel");
		
	}
	
	@Override
	public void petrolEngine() {
		System.out.println("Car -- petrol engine");
	}
	
	public static void billing() {
		System.out.println("Car -- billing");
	}

}
