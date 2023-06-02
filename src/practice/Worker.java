package practice;

public class Worker {
	
	private String name;
	private int age;
	private double salary;
	private String city;
	private String country;
	
	public Worker(String name, int age, double salary, String city, String country) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.city = city;
		this.country = country;
	}
	//public getter and setter
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}
