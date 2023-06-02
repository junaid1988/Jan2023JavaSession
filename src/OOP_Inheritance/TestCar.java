package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start(); //Overridden
		b.stop(); // Inherited
		b.refuel(); // Inherited
		b.autoParking(); //Individual
		b.engine();//Inherited
		b.theftSafety();
		
		BMW.billing();
		
		System.out.println("------------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		c.petrolEngine();
		Car.billing();
		
		System.out.println("------------");
		//child class object can be referred by parent class ref variable
		//Top/Up casting : can access only overridden and inherited methods 
		Car c1 = new BMW();
		
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.autoParking(); //not allowed -- reference type check is failed
		
		//child class object can be referred by grand parent class reference variable
		Vehicle v1 = new BMW();
		v1.engine();
		v1.petrolEngine();
		
		
		//down casting:
		//parent class object referred by child class reference variable
		BMW b1 = (BMW)new Car();//ClassCastException
		BMW b2 = (BMW) new Vehicle();//ClassCastException
	
	
		
		

	}

}
