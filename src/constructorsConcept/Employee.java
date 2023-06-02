package constructorsConcept;

public class Employee {

	
	String name;
	int age;
	double salary;
	
	//const:
	//name is as same as the class name
	//can not have return value/void
	//no return type
	//const.. will be called when you create the object
	//const will be overloaded
	
	public Employee() {//o para:
		System.out.println("default const....");
	}
	public Employee(int i) {//1 const:
		System.out.println("1 param const...."+i);
	}
	public Employee(int i, String p) {//2 const:
		System.out.println("2 param const...."+1+p);
	}

	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.name = "Azam";
		obj.age = 30;
		obj.salary = 1234.34;
		
		Employee obj1 = new Employee(10);
		Employee obj2 = new Employee(20, "testing");
		
	;
	

	}

}
