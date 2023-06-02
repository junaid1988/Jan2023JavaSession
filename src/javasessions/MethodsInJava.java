package javasessions;

public class MethodsInJava {

	// methods -- class data member

	// 1. no input, no return

	public void test() {
		
		System.out.println("test method");
		int i = 10;
		System.out.println(i);

	}
	//2. no input, but some return
	public int totalAmount() {
		System.out.println("total amount...");
		int i = 10;
		int tax = 5;
		int finalPayment = i+tax;//15
		return finalPayment;
	}
	
	public String trainerName() {
		System.out.println("trainer name");
		String name = "Naveen";
		return name;
	}
	
	public char getGender() {
		System.out.println("get gender");
		char c = 'a';
		return c;
	}
	
	//3. some input, some return
	public int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	

	public static void main(String[] args) {
		
		//create the object
		MethodsInJava obj = new MethodsInJava();
		obj.test();// calling the method
		
		int val = obj.totalAmount();
		System.out.println(val);
		
		String tr = obj.trainerName();
		System.out.println(tr);
		
		if(tr.equals("Naveen")) {
			System.out.println();
		}
		
		System.out.println(obj.getGender());// it is not recommended 
		char t = obj.getGender();
		System.out.println((byte) t);
		
		int s1 = obj.add(10, 20);
		System.out.println(s1);
		
		int s2 = obj.add(30, 40);//arguments
		System.out.println(s2-5);
		
		
		
		
		

	}

}
