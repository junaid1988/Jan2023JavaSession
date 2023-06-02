package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		
		//Post-- Create
		
		Employee e1 = new Employee("Azam", 25, 123.12, "Kabul", "Afghanistan");
		
		
		//Get -- Retrieve
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getCity());
		System.out.println(e1.getCountry());
		
		System.out.println("----------");
		
		//Put - Update
		e1.setAge(25);
		e1.setSalary(12.13);
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getCity());
		System.out.println(e1.getCountry());
		
//		e1.setName("Azam");
//		e1.setAge(25);
//		e1.setSalary(123.12);
//		e1.setCity("Kabul");
//		e1.setCountry("Afghanistan");
//		
//		System.out.println(e1.getName());
//		System.out.println(e1.getAge());
//		System.out.println(e1.getSalary());
//		System.out.println(e1.getCity());
//		System.out.println(e1.getCountry());
		

	}

}
