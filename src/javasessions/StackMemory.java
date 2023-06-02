package javasessions;

public class StackMemory {
	
	// NS -- NS --> Yes (No Objecy)
	// S -- S --> Yes (No Object)
	//NS -- S --> : directly 

	public static void t1() {
		System.out.println("t1 method");
		t2();

	}

	public static void t2() {
		System.out.println("t2 method");
		t3();

	}

	public static void t3() {
		System.out.println("t3 method");

	}

	public void m1() {
		System.out.println("m1 method");
		int i = 10;

		m2();

	}

	public void m2() {
		System.out.println("m3 method");
		int p = 20;
		m3();

	}

	public void m3() {
		System.out.println("m3 method");
		
		StackMemory.t1();

	}

	public static void main(String[] args) {

		StackMemory obj = new StackMemory();
		obj.m1();

	}

}
