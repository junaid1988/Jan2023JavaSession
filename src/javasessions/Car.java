package javasessions;

public class Car {

	String name;
	String color;
	int price;
	static int wheels = 4;
	
	// static is the common property for all the objects
	//but object will not hold static property
	//static variable will be stored in CMA = Common Memory Allocation/	 permanent generation/meterspace
	//and it will create only one copy for all the objects

	public static void main(String[] args) {

		Car c1 = new Car();

		c1.name = "Mercedes Benz";
		c1.color = "Black";
		c1.price = 120000;
		
		//how to access static var
		//using the class name
		
		System.out.println(c1.name+ " "+ c1.color+ " "+ c1.price+ " "+ Car.wheels);
	

		Car c2 = new Car();

		c2.name = "Audi";
		c2.color = "White";
		c2.price = 130000;
		
		System.out.println(c2.name+ " "+ c2.color+ " "+ c2.price+ " "+ Car.wheels);
		System.out.println(c1.wheels);// not a right way of calling static var using the ref name
		System.out.println(wheels);
	

		Car c3 = new Car();

		c3.name = "BMW";
		c3.color = "Red";
		c3.price = 150000;
		
		System.out.println(c3.name+ " "+ c3.color+ " "+ c3.price+ " "+ Car.wheels);

		Car c4 = new Car();

		c4.name = "Cadallic Escalade";
		c4.color = "Black";
		c4.price = 115000;
		
		System.out.println(c4.name+ " "+ c4.color+ " "+ c4.price+ " "+ Car.wheels);

	}

}
