package javasessions;

public class Customer {
		
		String name;
		int age;
		double salary;
		char gender;
		boolean isActive;
		String dob;
		
		public static void main(String[] args) {
			
			Customer c1 = new Customer();
			System.out.println(c1.name);
			System.out.println(c1.age);
			System.out.println(c1.salary);
			System.out.println(c1.gender);
			System.out.println(c1.isActive); // '/0000' - unicode value
			System.out.println(c1.dob);
			
			c1.name = "Tom";
			System.out.println(c1.name);
			
			Customer c2 = new Customer();
			
			Customer c3 = new Customer(); // object with reference
			
			new Customer().name = "Peter"; // No reference
			new Customer().age = 30;
			
			Customer c4; // just a reference without object
			
			Customer c5 = new Customer();
			c5=null; // null reference
			
			
			// call gc:
			// System.gc(); // is not recommended... // is not a good practice
			
			Customer c6 = new Customer();
			Customer c7 = new Customer();
			
			c6= c7;
			
			Customer c8;
			c8 = new Customer();
			
			
			
			
			
			
			
			
			
			
			

	}

}
