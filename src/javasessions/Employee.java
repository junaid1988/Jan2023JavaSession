package javasessions;

public class Employee {
	
	//Class variable -- class data member
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		//String name = "Naveen"; // local var
		// class -- template/blueprint of the object/category of the object
		//Object -- is a physical entity
		//Object of the class: new keyword
		
		Employee obj = new Employee();
		obj.name="Mike";
		obj.age = 30;
		obj.city = "California";
		System.out.println(obj.name + " "+ obj.age + " "+ obj.city);
		
		//
		Employee obj1 = new Employee();
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.city);
		
		

	}

}
