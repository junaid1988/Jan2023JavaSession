package OOP_Inheritance;

public class BMW extends Car{
	
	//Method overridden: Poly + Morphism --> Run time (Dynamic binding)
	// When you have a method in parent class and the same method in child class:
	//with the same number of parameters
	//with the same return
	
	@Override
	public void start() {
		System.out.println("BMW-- start");
	}
	
	public void autoParking() {
		System.out.println("BMW--- Auto parking");
		
	}
	
	@Override
	public void petrolEngine() {
		System.out.println("BMW -- petrol engine");
	}
	public void theftSafety() {
		System.out.println("BMW --- theftSafety");
	}
	
	//method hiding: when you have a static method in parent class and same static method in child class
	//can not be overridden
	
	public static void billing() {
		System.out.println("BMW -- billing");
	}
	
	private void pickColor() {
		System.out.println("BMW---pick color");
	}
	
	

}
