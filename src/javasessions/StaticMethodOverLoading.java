package javasessions;

public class StaticMethodOverLoading {
	
	public static void login() {
		
	}
	public static void login(int i) {
		
	}
	public static void login(int i, int j) {
		
	}
	

	public static void main(String[] args) {
		System.out.println("main method");
		
		StaticMethodOverLoading.main(10);
		StaticMethodOverLoading.main(20, 30);
		
		StaticMethodOverLoading obj = new StaticMethodOverLoading();
		obj.main(123, 12.13);
		
		// src code(.java) -compile Time-->.class(decision of method calling)-->JVM -->run it-- machine code(OS)
		
		
	}
	public void main(int a, double b) {
		System.out.println("main method" +a+b);
	}
	
	public static void main(int a) {
		System.out.println("main method"+a);
		
	}
	public static void main(String a[], int b) {
		System.out.println("main method" +a+b);
		
	}
	public static void main() {
		System.out.println("main method without any value");
	}
	public static void main(int a, int b) {
		System.out.println("main method"+a+b);
		
	}

}
