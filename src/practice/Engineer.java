package practice;

public class Engineer {
	
	String name;
	int age;
	double salary;
	String city;
	
	
	
	public Engineer(String name, int age) {
		
		this.name = name;
		this.age = age;
	}



	public Engineer(String name, int age, double salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	


	public Engineer(String name, int age, double salary, String city) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.city = city;
	}


	public Engineer(String name) {
		this("Ferdows", 25, 12.13);
		this.name = name;
		this.age = 30;
		this.salary = 14.13;
		this.city = "Dallas";
		
	}
	
	
	
	
	
	

}
