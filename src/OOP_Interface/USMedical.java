package OOP_Interface;

public interface USMedical extends WHO {
	
	//static and final in nature(by default)
	int min_fee =10;
	boolean isApproved = true;
	//absract method:
	//no method body
	//only method declaration/method prototype/no business logic
	//can not create object of interfaces
	//can not create object constructor ... of interface
	
	//abstract methods: 100% abstraction -- OOP
	public void physioServices();
	
	public void cardioServices();
	
	public void dentalServices();
	
	public void emergencyServices();
	
	
	//after JDK 1.8:
	//1. we can have static method with method body
	public static void billing() {
		System.out.println("US Medical-- billing");
	}
	
	//2. default method with method body
	
	default void medicalTest() {
		System.out.println("US Medical test");
	}
	default void medicalReport() {
		System.out.println("US Medical report");
	}
	
	
	
	

}
